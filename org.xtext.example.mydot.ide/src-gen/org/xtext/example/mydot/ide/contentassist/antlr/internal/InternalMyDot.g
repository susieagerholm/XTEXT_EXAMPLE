/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDot;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydot.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydot.services.MyDotGrammarAccess;

}
@parser::members {
	private MyDotGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
		(rule__Feature__Alternatives)
		{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReference
entryRuleReference
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceAccess().getGroup()); }
		(rule__Reference__Group__0)
		{ after(grammarAccess.getReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUsage
entryRuleUsage
:
{ before(grammarAccess.getUsageRule()); }
	 ruleUsage
{ after(grammarAccess.getUsageRule()); } 
	 EOF 
;

// Rule Usage
ruleUsage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUsageAccess().getGroup()); }
		(rule__Usage__Group__0)
		{ after(grammarAccess.getUsageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDotExpression
entryRuleDotExpression
:
{ before(grammarAccess.getDotExpressionRule()); }
	 ruleDotExpression
{ after(grammarAccess.getDotExpressionRule()); } 
	 EOF 
;

// Rule DotExpression
ruleDotExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDotExpressionAccess().getGroup()); }
		(rule__DotExpression__Group__0)
		{ after(grammarAccess.getDotExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityRef
entryRuleEntityRef
:
{ before(grammarAccess.getEntityRefRule()); }
	 ruleEntityRef
{ after(grammarAccess.getEntityRefRule()); } 
	 EOF 
;

// Rule EntityRef
ruleEntityRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityRefAccess().getGroup()); }
		(rule__EntityRef__Group__0)
		{ after(grammarAccess.getEntityRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DataType
ruleDataType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getAlternatives()); }
		(rule__DataType__Alternatives)
		{ after(grammarAccess.getDataTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); }
		ruleAttribute
		{ after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); }
		ruleReference
		{ after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); }
		('string')
		{ after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); }
		('int')
		{ after(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); }
	(rule__Model__EntitiesAssignment_0)*
	{ after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getUsagesAssignment_1()); }
	(rule__Model__UsagesAssignment_1)*
	{ after(grammarAccess.getModelAccess().getUsagesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); }
	(rule__Entity__FeaturesAssignment_3)*
	{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); }
	'attr'
	{ after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
	(rule__Attribute__TypeAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__0__Impl
	rule__Reference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getRefKeyword_0()); }
	'ref'
	{ after(grammarAccess.getReferenceAccess().getRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__1__Impl
	rule__Reference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getNameAssignment_1()); }
	(rule__Reference__NameAssignment_1)
	{ after(grammarAccess.getReferenceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__2__Impl
	rule__Reference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getReferenceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Reference__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); }
	(rule__Reference__TypeAssignment_3)
	{ after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Usage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Usage__Group__0__Impl
	rule__Usage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Usage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsageAccess().getUseKeyword_0()); }
	'use'
	{ after(grammarAccess.getUsageAccess().getUseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Usage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Usage__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Usage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUsageAccess().getRefAssignment_1()); }
	(rule__Usage__RefAssignment_1)
	{ after(grammarAccess.getUsageAccess().getRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DotExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DotExpression__Group__0__Impl
	rule__DotExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDotExpressionAccess().getEntityRefParserRuleCall_0()); }
	ruleEntityRef
	{ after(grammarAccess.getDotExpressionAccess().getEntityRefParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DotExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDotExpressionAccess().getGroup_1()); }
	(rule__DotExpression__Group_1__0)*
	{ after(grammarAccess.getDotExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DotExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DotExpression__Group_1__0__Impl
	rule__DotExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); }
	()
	{ after(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DotExpression__Group_1__1__Impl
	rule__DotExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); }
	'.'
	{ after(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DotExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); }
	(rule__DotExpression__TailAssignment_1_2)
	{ after(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityRef__Group__0__Impl
	rule__EntityRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityRefAccess().getEntityRefAction_0()); }
	()
	{ after(grammarAccess.getEntityRefAccess().getEntityRefAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityRefAccess().getEntityAssignment_1()); }
	(rule__EntityRef__EntityAssignment_1)
	{ after(grammarAccess.getEntityRefAccess().getEntityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__EntitiesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); }
		ruleEntity
		{ after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__UsagesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getUsagesUsageParserRuleCall_1_0()); }
		ruleUsage
		{ after(grammarAccess.getModelAccess().getUsagesUsageParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); }
		ruleFeature
		{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); }
		ruleDataType
		{ after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Usage__RefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUsageAccess().getRefDotExpressionParserRuleCall_1_0()); }
		ruleDotExpression
		{ after(grammarAccess.getUsageAccess().getRefDotExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DotExpression__TailAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDotExpressionAccess().getTailFeatureCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getDotExpressionAccess().getTailFeatureIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDotExpressionAccess().getTailFeatureIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getDotExpressionAccess().getTailFeatureCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRef__EntityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRefAccess().getEntityEntityCrossReference_1_0()); }
		(
			{ before(grammarAccess.getEntityRefAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityRefAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getEntityRefAccess().getEntityEntityCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;