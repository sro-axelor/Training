package com.axelor.guice_ConstantBinding;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

/*---- main class ----*/
public class GuiceRun3 {

	   public static void main(String[] args) {
	      Injector injector = Guice.createInjector(new TextEditorModule());
	      TextEditor3 editor = injector.getInstance(TextEditor3.class);
	      editor.makeConnection();
	   } 
	}

/*---- app class ----*/
	class TextEditor3 {
		
	   private String databaseurl;
	   
	   @Inject
	   public TextEditor3(@Named("JDBC") String databaseurl) {
	      this.databaseurl = databaseurl;
	   }

	   public void makeConnection(){
	      System.out.println(databaseurl);
	   } 
	}

/*---- Binding Module class ----*/
	class TextEditorModule extends AbstractModule {

	   @Override
	   protected void configure() {
	      bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
	   } 
	   
	}	   
