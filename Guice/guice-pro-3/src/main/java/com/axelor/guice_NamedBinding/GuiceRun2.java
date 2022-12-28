package com.axelor.guice_NamedBinding;


import com.axelor.guice_Interfaces.SpellChecker;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

/*---- main class ----*/
public class GuiceRun2 {
	 public static void main(String[] args) {
	      Injector injector = Guice.createInjector(new TextEditorModule());
	      TextEditor2 editor = injector.getInstance(TextEditor2.class);
	      editor.makeSpellCheck();
	   } 
	}

/*---- app class ----*/
	class TextEditor2 {
	   private SpellChecker spellChecker;
	   
	   @Inject
	   public TextEditor2(@Named("OpenOffice") SpellChecker spellChecker) {
	      this.spellChecker = spellChecker;      
	   }

	   public void makeSpellCheck(){
	      spellChecker.checkSpelling(); 
	   }  
	}

	
/*---- Binding Module class ----*/
	class TextEditorModule extends AbstractModule {

	   @Override
	   protected void configure() {
	      bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice"))
	         .to(OpenOfficeWordSpellCheckerImpl.class);
	   } 
	}

	
/*---- spell checker implementation class ----*/
	class SpellCheckerImpl implements SpellChecker {

	   @Override
	   public void checkSpelling() {
	      System.out.println("Inside in the method checkSpelling." );
	   } 
	}

	
/*---- subclass of SpellCheckerImpl class ----*/
	class OpenOfficeWordSpellCheckerImpl extends SpellCheckerImpl{
	   @Override
	   public void checkSpelling() {
	      System.out.println("Inside in the method OpenOfficeWordSpellCheckerImpl.checkSpelling." );
	   } 
	}

	