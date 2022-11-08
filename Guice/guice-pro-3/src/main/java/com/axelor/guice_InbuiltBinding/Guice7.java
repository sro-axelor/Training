package com.axelor.guice_InbuiltBinding;

import java.util.logging.Logger;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/*---- main class ----*/
public class Guice7 {
	public static void main(String[] args) {
	      Injector injector = Guice.createInjector(new TextEditorModule());
	      TextEditor editor = injector.getInstance(TextEditor.class);
	      editor.makeSpellCheck();
	   } 
	}

/*---- app class ----*/
	class TextEditor {
	   private Logger logger;

	   @Inject
	   public TextEditor( Logger logger) {
	      this.logger = logger;
	   }

	   public void makeSpellCheck(){
	      logger.info("In TextEditor.makeSpellCheck() method");
	   } 
	}

/*---- Binding Module class ----*/
	class TextEditorModule extends AbstractModule {

	   @Override
	   protected void configure() {
	   } 
	}
