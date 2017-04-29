/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydot.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydot.ide.contentassist.antlr.internal.InternalMyDotParser;
import org.xtext.example.mydot.services.MyDotGrammarAccess;

public class MyDotParser extends AbstractContentAssistParser {

	@Inject
	private MyDotGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDotParser createParser() {
		InternalMyDotParser result = new InternalMyDotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getUsageAccess().getGroup(), "rule__Usage__Group__0");
					put(grammarAccess.getDotExpressionAccess().getGroup(), "rule__DotExpression__Group__0");
					put(grammarAccess.getDotExpressionAccess().getGroup_1(), "rule__DotExpression__Group_1__0");
					put(grammarAccess.getEntityRefAccess().getGroup(), "rule__EntityRef__Group__0");
					put(grammarAccess.getModelAccess().getEntitiesAssignment_0(), "rule__Model__EntitiesAssignment_0");
					put(grammarAccess.getModelAccess().getUsagesAssignment_1(), "rule__Model__UsagesAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_3(), "rule__Entity__FeaturesAssignment_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getReferenceAccess().getNameAssignment_1(), "rule__Reference__NameAssignment_1");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_3(), "rule__Reference__TypeAssignment_3");
					put(grammarAccess.getUsageAccess().getRefAssignment_1(), "rule__Usage__RefAssignment_1");
					put(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2(), "rule__DotExpression__TailAssignment_1_2");
					put(grammarAccess.getEntityRefAccess().getEntityAssignment_1(), "rule__EntityRef__EntityAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDotParser typedParser = (InternalMyDotParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
