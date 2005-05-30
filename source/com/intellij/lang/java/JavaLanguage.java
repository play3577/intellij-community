package com.intellij.lang.java;

import com.intellij.ide.highlighter.JavaFileHighlighter;
import com.intellij.lang.Commenter;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.surroundWith.SurroundDescriptor;
import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.formatter.PsiBasedFormattingModel;
import com.intellij.psi.formatter.java.AbstractJavaBlock;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.impl.source.SourceTreeToPsiMap;
import com.intellij.newCodeFormatting.FormattingModelBuilder;
import com.intellij.newCodeFormatting.FormattingModel;
import com.intellij.codeInsight.generation.surroundWith.JavaExpressionSurroundDescriptor;
import com.intellij.codeInsight.generation.surroundWith.JavaStatementsSurroundDescriptor;

/**
 * Created by IntelliJ IDEA.
 * User: max
 * Date: Jan 22, 2005
 * Time: 11:16:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaLanguage extends Language {
  private final FormattingModelBuilder myFormattingModelBuilder;

  private final static SurroundDescriptor[] SURROUND_DESCRIPTORS = new SurroundDescriptor[] {
    new JavaExpressionSurroundDescriptor(),
    new JavaStatementsSurroundDescriptor()
  };

  public JavaLanguage() {
    super("JAVA");
    myFormattingModelBuilder = new FormattingModelBuilder() {
      public FormattingModel createModel(final PsiElement element, final CodeStyleSettings settings) {
        return new PsiBasedFormattingModel(element.getContainingFile(), settings, AbstractJavaBlock.createJavaBlock(SourceTreeToPsiMap.psiElementToTree(element), 
                                                                                                settings));
      }
    };
  }

  public SyntaxHighlighter getSyntaxHighlighter(Project project) {
    LanguageLevel level = project != null ? PsiManager.getInstance(project).getEffectiveLanguageLevel() : LanguageLevel.HIGHEST;
    return new JavaFileHighlighter(level);
  }

  public ParserDefinition getParserDefinition() {
    return new JavaParserDefinition();
  }

  public Commenter getCommenter() {
    return new JavaCommenter();
  }

  public FindUsagesProvider getFindUsagesProvider() {
    return new JavaFindUsagesProvider();
  }

  public RefactoringSupportProvider getRefactoringSupportProvider() {
    return new JavaRefactoringSupportProvier();
  }

  public FormattingModelBuilder getFormattingModelBuilder() {
    return myFormattingModelBuilder;
  }

  public SurroundDescriptor[] getSurroundDescriptors() {
    return SURROUND_DESCRIPTORS;
  }
}
