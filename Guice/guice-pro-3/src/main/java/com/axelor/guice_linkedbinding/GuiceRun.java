package com.axelor.guice_linkedbinding;


 import com.axelor.guice_Interfaces.SpellChecker;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/*---- main class ----*/
public class GuiceRun {
   public static void main(String[] args) {
      Injector injector = Guice.createInjector(new TextEditorModule());
      TextEditor editor = injector.getInstance(TextEditor.class);
      editor.makeSpellCheck(); 
   } 
}

/*---- app class ----*/
class TextEditor {
   private SpellChecker spellChecker;

   @Inject
   public TextEditor(SpellChecker spellChecker) {
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
      bind(SpellChecker.class).to(SpellCheckerImpl.class);
      bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
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

