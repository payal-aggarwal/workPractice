package com.test.automation.pages;

import java.util.List;
import java.util.*;

import javax.mail.*;
import javax.mail.search.FlagTerm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import com.test.automation.base.TestBase;
	
public class EmailInbox extends TestBase {
	
	/*public void searchMail()
	{
		driver.findElement(By.id("gbqfq")).sendKeys("Newegg.com- Password Retrieve");
		driver.findElement(By.id("gbqfb")).click();
		List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));*/
	public void emailFetch() throws MessagingException {
	Session session = Session.getDefaultInstance(new Properties( ));
    Store store = session.getStore("imaps");
    store.connect("imap.googlemail.com", 993,"ctschallenge18@gmail.com","Challenge18");
    Folder inbox = store.getFolder( "INBOX" );
    inbox.open( Folder.READ_ONLY );

    // Fetch unseen messages from inbox folder
    Message[] messages = inbox.search(
        new FlagTerm(new Flags(Flags.Flag.SEEN), false));

    // Sort messages from recent to oldest
    Arrays.sort( messages, ( m1, m2 ) -> {
      try {
        return m2.getSentDate().compareTo( m1.getSentDate() );
      } catch ( MessagingException e ) {
        throw new RuntimeException( e );
      }
    } );

    for ( Message message : messages ) {
      System.out.println( 
          "sendDate: " + message.getSentDate()
          + " subject:" + message.getSubject() );
    }
  }
		
		
	}

