/*
 * generated by Xtext
 */
package org.eclipse.xtext.parsetree.impl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parsetree.impl.parser.antlr.internal.InternalBug305397Parser;
import org.eclipse.xtext.parsetree.impl.services.Bug305397GrammarAccess;

public class Bug305397Parser extends AbstractAntlrParser {

	@Inject
	private Bug305397GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBug305397Parser createParser(XtextTokenStream stream) {
		return new InternalBug305397Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Bug305397GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Bug305397GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}