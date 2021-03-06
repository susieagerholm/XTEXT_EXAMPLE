/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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

// Entry rule entryRuleRobot
entryRuleRobot
:
{ before(grammarAccess.getRobotRule()); }
	 ruleRobot
{ after(grammarAccess.getRobotRule()); } 
	 EOF 
;

// Rule Robot
ruleRobot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRobotAccess().getGroup()); }
		(rule__Robot__Group__0)
		{ after(grammarAccess.getRobotAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTopology
entryRuleTopology
:
{ before(grammarAccess.getTopologyRule()); }
	 ruleTopology
{ after(grammarAccess.getTopologyRule()); } 
	 EOF 
;

// Rule Topology
ruleTopology 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTopologyAccess().getGroup()); }
		(rule__Topology__Group__0)
		{ after(grammarAccess.getTopologyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLink
entryRuleLink
:
{ before(grammarAccess.getLinkRule()); }
	 ruleLink
{ after(grammarAccess.getLinkRule()); } 
	 EOF 
;

// Rule Link
ruleLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLinkAccess().getGroup()); }
		(rule__Link__Group__0)
		{ after(grammarAccess.getLinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJoint
entryRuleJoint
:
{ before(grammarAccess.getJointRule()); }
	 ruleJoint
{ after(grammarAccess.getJointRule()); } 
	 EOF 
;

// Rule Joint
ruleJoint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJointAccess().getGroup()); }
		(rule__Joint__Group__0)
		{ after(grammarAccess.getJointAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJointRef
entryRuleJointRef
:
{ before(grammarAccess.getJointRefRule()); }
	 ruleJointRef
{ after(grammarAccess.getJointRefRule()); } 
	 EOF 
;

// Rule JointRef
ruleJointRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJointRefAccess().getAlternatives()); }
		(rule__JointRef__Alternatives)
		{ after(grammarAccess.getJointRefAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule JointType
ruleJointType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointTypeAccess().getAlternatives()); }
		(rule__JointType__Alternatives)
		{ after(grammarAccess.getJointTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getLinkAssignment_4_0()); }
		(rule__Robot__LinkAssignment_4_0)
		{ after(grammarAccess.getRobotAccess().getLinkAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getRobotAccess().getJointAssignment_4_1()); }
		(rule__Robot__JointAssignment_4_1)
		{ after(grammarAccess.getRobotAccess().getJointAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointRef__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointRefAccess().getFixAssignment_0()); }
		(rule__JointRef__FixAssignment_0)
		{ after(grammarAccess.getJointRefAccess().getFixAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getJointRefAccess().getRevAssignment_1()); }
		(rule__JointRef__RevAssignment_1)
		{ after(grammarAccess.getJointRefAccess().getRevAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); }
		(rule__JointRef__PrisAssignment_2)
		{ after(grammarAccess.getJointRefAccess().getPrisAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getJointRefAccess().getContAssignment_3()); }
		(rule__JointRef__ContAssignment_3)
		{ after(grammarAccess.getJointRefAccess().getContAssignment_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); }
		('Fixed')
		{ after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); }
		('Revolute')
		{ after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); }
		('Prismatic')
		{ after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); }
		('Continuous')
		{ after(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__0__Impl
	rule__Robot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getRobotKeyword_0()); }
	'Robot'
	{ after(grammarAccess.getRobotAccess().getRobotKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__1__Impl
	rule__Robot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getNameAssignment_1()); }
	(rule__Robot__NameAssignment_1)
	{ after(grammarAccess.getRobotAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__2__Impl
	rule__Robot__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getTopologyKeyword_2()); }
	'Topology'
	{ after(grammarAccess.getRobotAccess().getTopologyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__3__Impl
	rule__Robot__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); }
		(rule__Robot__TopologiesAssignment_3)
		{ after(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); }
	)
	(
		{ before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); }
		(rule__Robot__TopologiesAssignment_3)*
		{ after(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Robot__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRobotAccess().getAlternatives_4()); }
	(rule__Robot__Alternatives_4)*
	{ after(grammarAccess.getRobotAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Topology__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Topology__Group__0__Impl
	rule__Topology__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopologyAccess().getParentAssignment_0()); }
	(rule__Topology__ParentAssignment_0)
	{ after(grammarAccess.getTopologyAccess().getParentAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Topology__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopologyAccess().getGroup_1()); }
	(rule__Topology__Group_1__0)?
	{ after(grammarAccess.getTopologyAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Topology__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Topology__Group_1__0__Impl
	rule__Topology__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); }
	(rule__Topology__JointAssignment_1_0)
	{ after(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Topology__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); }
	(rule__Topology__ChildAssignment_1_1)
	{ after(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Link__Group__0__Impl
	rule__Link__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinkAccess().getLinkKeyword_0()); }
	'Link'
	{ after(grammarAccess.getLinkAccess().getLinkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Link__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinkAccess().getNameAssignment_1()); }
	(rule__Link__NameAssignment_1)
	{ after(grammarAccess.getLinkAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Joint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__0__Impl
	rule__Joint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getJointKeyword_0()); }
	'Joint'
	{ after(grammarAccess.getJointAccess().getJointKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__1__Impl
	rule__Joint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getNameAssignment_1()); }
	(rule__Joint__NameAssignment_1)
	{ after(grammarAccess.getJointAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__2__Impl
	rule__Joint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getTypeKeyword_2()); }
	'Type'
	{ after(grammarAccess.getJointAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__3__Impl
	rule__Joint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getTypeAssignment_3()); }
	(rule__Joint__TypeAssignment_3)
	{ after(grammarAccess.getJointAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__4__Impl
	rule__Joint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getChildOfKeyword_4()); }
	'ChildOf'
	{ after(grammarAccess.getJointAccess().getChildOfKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__5__Impl
	rule__Joint__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getChildOfAssignment_5()); }
	(rule__Joint__ChildOfAssignment_5)
	{ after(grammarAccess.getJointAccess().getChildOfAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__6__Impl
	rule__Joint__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getParentOfKeyword_6()); }
	'ParentOf'
	{ after(grammarAccess.getJointAccess().getParentOfKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Joint__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJointAccess().getParentOfAssignment_7()); }
	(rule__Joint__ParentOfAssignment_7)
	{ after(grammarAccess.getJointAccess().getParentOfAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Robot__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__TopologiesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_3_0()); }
		ruleTopology
		{ after(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__LinkAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_4_0_0()); }
		ruleLink
		{ after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__JointAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); }
		ruleJoint
		{ after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__ParentAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopologyAccess().getParentSTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getTopologyAccess().getParentSTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__JointAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); }
		ruleJointRef
		{ after(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Topology__ChildAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); }
		ruleTopology
		{ after(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); }
		ruleJointType
		{ after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__ChildOfAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); }
		(
			{ before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Joint__ParentOfAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); }
		(
			{ before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); }
			RULE_ID
			{ after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointRef__FixAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); }
		(
			{ before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); }
			'->'
			{ after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); }
		)
		{ after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointRef__RevAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); }
		(
			{ before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); }
			'r->'
			{ after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); }
		)
		{ after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointRef__PrisAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); }
		(
			{ before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); }
			'p->'
			{ after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); }
		)
		{ after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JointRef__ContAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); }
		(
			{ before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); }
			'c->'
			{ after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); }
		)
		{ after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); }
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
