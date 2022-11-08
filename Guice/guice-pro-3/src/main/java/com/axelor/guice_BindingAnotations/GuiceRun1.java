package com.axelor.guice_BindingAnotations;

import com.axelor.guice_Interfaces.SpellChecker;
import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


/*---- annotation interface ----*/
@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface WinWord {
	
}

/*---- main class ----*/
public class GuiceRun1 {
   public static void main(String[] args) {
      Injector injector = Guice.createInjector(new TextEditorModule());
      TextEditor1 editor = injector.getInstance(TextEditor1.class);
      editor.makeSpellCheck();     
   } 
}

/*---- app class ----*/
class TextEditor1 {
   private SpellChecker spellChecker;   

   @Inject
   public TextEditor1(@WinWord SpellChecker spellChecker) {
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
      bind(SpellChecker.class).annotatedWith(WinWord.class)
         .to(WinWordSpellCheckerImpl.class);    
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
class WinWordSpellCheckerImpl extends SpellCheckerImpl{
   @Override
   public void checkSpelling() {
      System.out.println("Inside in the method WinWordSpellCheckerImpl.checkSpelling." );
   } 
}

