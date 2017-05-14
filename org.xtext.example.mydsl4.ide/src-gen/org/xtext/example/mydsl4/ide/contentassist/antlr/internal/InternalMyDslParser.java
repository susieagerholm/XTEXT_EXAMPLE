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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'", "'Robot'", "'Topology'", "'Link'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'->'", "'r->'", "'p->'", "'c->'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


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



    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRobot EOF )
            // InternalMyDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalMyDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleTopology"
    // InternalMyDsl.g:78:1: entryRuleTopology : ruleTopology EOF ;
    public final void entryRuleTopology() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTopology EOF )
            // InternalMyDsl.g:80:1: ruleTopology EOF
            {
             before(grammarAccess.getTopologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getTopologyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopology"


    // $ANTLR start "ruleTopology"
    // InternalMyDsl.g:87:1: ruleTopology : ( ( rule__Topology__Group__0 ) ) ;
    public final void ruleTopology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Topology__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Topology__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Topology__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Topology__Group__0 )
            {
             before(grammarAccess.getTopologyAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Topology__Group__0 )
            // InternalMyDsl.g:94:4: rule__Topology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopology"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:103:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLink EOF )
            // InternalMyDsl.g:105:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:112:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:119:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:128:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleJoint EOF )
            // InternalMyDsl.g:130:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalMyDsl.g:137:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:144:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleJointRef"
    // InternalMyDsl.g:153:1: entryRuleJointRef : ruleJointRef EOF ;
    public final void entryRuleJointRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleJointRef EOF )
            // InternalMyDsl.g:155:1: ruleJointRef EOF
            {
             before(grammarAccess.getJointRefRule()); 
            pushFollow(FOLLOW_1);
            ruleJointRef();

            state._fsp--;

             after(grammarAccess.getJointRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJointRef"


    // $ANTLR start "ruleJointRef"
    // InternalMyDsl.g:162:1: ruleJointRef : ( ( rule__JointRef__Alternatives ) ) ;
    public final void ruleJointRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__JointRef__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__JointRef__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__JointRef__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__JointRef__Alternatives )
            {
             before(grammarAccess.getJointRefAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__JointRef__Alternatives )
            // InternalMyDsl.g:169:4: rule__JointRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointRef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointRefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointRef"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:178:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:185:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Robot__Alternatives_4"
    // InternalMyDsl.g:193:1: rule__Robot__Alternatives_4 : ( ( ( rule__Robot__LinkAssignment_4_0 ) ) | ( ( rule__Robot__JointAssignment_4_1 ) ) );
    public final void rule__Robot__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( ( rule__Robot__LinkAssignment_4_0 ) ) | ( ( rule__Robot__JointAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:198:2: ( ( rule__Robot__LinkAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:198:2: ( ( rule__Robot__LinkAssignment_4_0 ) )
                    // InternalMyDsl.g:199:3: ( rule__Robot__LinkAssignment_4_0 )
                    {
                     before(grammarAccess.getRobotAccess().getLinkAssignment_4_0()); 
                    // InternalMyDsl.g:200:3: ( rule__Robot__LinkAssignment_4_0 )
                    // InternalMyDsl.g:200:4: rule__Robot__LinkAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__LinkAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getLinkAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:2: ( ( rule__Robot__JointAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:204:2: ( ( rule__Robot__JointAssignment_4_1 ) )
                    // InternalMyDsl.g:205:3: ( rule__Robot__JointAssignment_4_1 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 
                    // InternalMyDsl.g:206:3: ( rule__Robot__JointAssignment_4_1 )
                    // InternalMyDsl.g:206:4: rule__Robot__JointAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Alternatives_4"


    // $ANTLR start "rule__JointRef__Alternatives"
    // InternalMyDsl.g:214:1: rule__JointRef__Alternatives : ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) );
    public final void rule__JointRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:219:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    {
                    // InternalMyDsl.g:219:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    // InternalMyDsl.g:220:3: ( rule__JointRef__FixAssignment_0 )
                    {
                     before(grammarAccess.getJointRefAccess().getFixAssignment_0()); 
                    // InternalMyDsl.g:221:3: ( rule__JointRef__FixAssignment_0 )
                    // InternalMyDsl.g:221:4: rule__JointRef__FixAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__FixAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getFixAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:225:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    {
                    // InternalMyDsl.g:225:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    // InternalMyDsl.g:226:3: ( rule__JointRef__RevAssignment_1 )
                    {
                     before(grammarAccess.getJointRefAccess().getRevAssignment_1()); 
                    // InternalMyDsl.g:227:3: ( rule__JointRef__RevAssignment_1 )
                    // InternalMyDsl.g:227:4: rule__JointRef__RevAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__RevAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getRevAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:231:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    {
                    // InternalMyDsl.g:231:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    // InternalMyDsl.g:232:3: ( rule__JointRef__PrisAssignment_2 )
                    {
                     before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 
                    // InternalMyDsl.g:233:3: ( rule__JointRef__PrisAssignment_2 )
                    // InternalMyDsl.g:233:4: rule__JointRef__PrisAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__PrisAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:237:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    {
                    // InternalMyDsl.g:237:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    // InternalMyDsl.g:238:3: ( rule__JointRef__ContAssignment_3 )
                    {
                     before(grammarAccess.getJointRefAccess().getContAssignment_3()); 
                    // InternalMyDsl.g:239:3: ( rule__JointRef__ContAssignment_3 )
                    // InternalMyDsl.g:239:4: rule__JointRef__ContAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__ContAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getContAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointRef__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalMyDsl.g:247:1: rule__JointType__Alternatives : ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:252:2: ( ( 'Fixed' ) )
                    {
                    // InternalMyDsl.g:252:2: ( ( 'Fixed' ) )
                    // InternalMyDsl.g:253:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:254:3: ( 'Fixed' )
                    // InternalMyDsl.g:254:4: 'Fixed'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:258:2: ( ( 'Revolute' ) )
                    {
                    // InternalMyDsl.g:258:2: ( ( 'Revolute' ) )
                    // InternalMyDsl.g:259:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:260:3: ( 'Revolute' )
                    // InternalMyDsl.g:260:4: 'Revolute'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:264:2: ( ( 'Prismatic' ) )
                    {
                    // InternalMyDsl.g:264:2: ( ( 'Prismatic' ) )
                    // InternalMyDsl.g:265:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:266:3: ( 'Prismatic' )
                    // InternalMyDsl.g:266:4: 'Prismatic'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:270:2: ( ( 'Continuous' ) )
                    {
                    // InternalMyDsl.g:270:2: ( ( 'Continuous' ) )
                    // InternalMyDsl.g:271:3: ( 'Continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:272:3: ( 'Continuous' )
                    // InternalMyDsl.g:272:4: 'Continuous'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:280:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:285:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyDsl.g:292:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:296:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:297:1: ( 'Robot' )
            {
            // InternalMyDsl.g:297:1: ( 'Robot' )
            // InternalMyDsl.g:298:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyDsl.g:307:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:312:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyDsl.g:319:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:324:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:324:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:325:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:326:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:326:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMyDsl.g:334:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:338:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:339:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMyDsl.g:346:1: rule__Robot__Group__2__Impl : ( 'Topology' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:350:1: ( ( 'Topology' ) )
            // InternalMyDsl.g:351:1: ( 'Topology' )
            {
            // InternalMyDsl.g:351:1: ( 'Topology' )
            // InternalMyDsl.g:352:2: 'Topology'
            {
             before(grammarAccess.getRobotAccess().getTopologyKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getTopologyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalMyDsl.g:361:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:366:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalMyDsl.g:373:1: rule__Robot__Group__3__Impl : ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) ) )
            // InternalMyDsl.g:378:1: ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) )
            {
            // InternalMyDsl.g:378:1: ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) )
            // InternalMyDsl.g:379:2: ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* )
            {
            // InternalMyDsl.g:379:2: ( ( rule__Robot__TopologiesAssignment_3 ) )
            // InternalMyDsl.g:380:3: ( rule__Robot__TopologiesAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 
            // InternalMyDsl.g:381:3: ( rule__Robot__TopologiesAssignment_3 )
            // InternalMyDsl.g:381:4: rule__Robot__TopologiesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Robot__TopologiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 

            }

            // InternalMyDsl.g:384:2: ( ( rule__Robot__TopologiesAssignment_3 )* )
            // InternalMyDsl.g:385:3: ( rule__Robot__TopologiesAssignment_3 )*
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 
            // InternalMyDsl.g:386:3: ( rule__Robot__TopologiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:386:4: rule__Robot__TopologiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Robot__TopologiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalMyDsl.g:395:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Robot__Group__4__Impl )
            // InternalMyDsl.g:400:2: rule__Robot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalMyDsl.g:406:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__Alternatives_4 )* ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( ( ( rule__Robot__Alternatives_4 )* ) )
            // InternalMyDsl.g:411:1: ( ( rule__Robot__Alternatives_4 )* )
            {
            // InternalMyDsl.g:411:1: ( ( rule__Robot__Alternatives_4 )* )
            // InternalMyDsl.g:412:2: ( rule__Robot__Alternatives_4 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_4()); 
            // InternalMyDsl.g:413:2: ( rule__Robot__Alternatives_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:413:3: rule__Robot__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Robot__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Topology__Group__0"
    // InternalMyDsl.g:422:1: rule__Topology__Group__0 : rule__Topology__Group__0__Impl rule__Topology__Group__1 ;
    public final void rule__Topology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Topology__Group__0__Impl rule__Topology__Group__1 )
            // InternalMyDsl.g:427:2: rule__Topology__Group__0__Impl rule__Topology__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Topology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topology__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group__0"


    // $ANTLR start "rule__Topology__Group__0__Impl"
    // InternalMyDsl.g:434:1: rule__Topology__Group__0__Impl : ( ( rule__Topology__ParentAssignment_0 ) ) ;
    public final void rule__Topology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( ( rule__Topology__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:439:1: ( ( rule__Topology__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:439:1: ( ( rule__Topology__ParentAssignment_0 ) )
            // InternalMyDsl.g:440:2: ( rule__Topology__ParentAssignment_0 )
            {
             before(grammarAccess.getTopologyAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:441:2: ( rule__Topology__ParentAssignment_0 )
            // InternalMyDsl.g:441:3: rule__Topology__ParentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__ParentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getParentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group__0__Impl"


    // $ANTLR start "rule__Topology__Group__1"
    // InternalMyDsl.g:449:1: rule__Topology__Group__1 : rule__Topology__Group__1__Impl ;
    public final void rule__Topology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Topology__Group__1__Impl )
            // InternalMyDsl.g:454:2: rule__Topology__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group__1"


    // $ANTLR start "rule__Topology__Group__1__Impl"
    // InternalMyDsl.g:460:1: rule__Topology__Group__1__Impl : ( ( rule__Topology__Group_1__0 )? ) ;
    public final void rule__Topology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( ( ( rule__Topology__Group_1__0 )? ) )
            // InternalMyDsl.g:465:1: ( ( rule__Topology__Group_1__0 )? )
            {
            // InternalMyDsl.g:465:1: ( ( rule__Topology__Group_1__0 )? )
            // InternalMyDsl.g:466:2: ( rule__Topology__Group_1__0 )?
            {
             before(grammarAccess.getTopologyAccess().getGroup_1()); 
            // InternalMyDsl.g:467:2: ( rule__Topology__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=25)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:467:3: rule__Topology__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Topology__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group__1__Impl"


    // $ANTLR start "rule__Topology__Group_1__0"
    // InternalMyDsl.g:476:1: rule__Topology__Group_1__0 : rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 ;
    public final void rule__Topology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 )
            // InternalMyDsl.g:481:2: rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Topology__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topology__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group_1__0"


    // $ANTLR start "rule__Topology__Group_1__0__Impl"
    // InternalMyDsl.g:488:1: rule__Topology__Group_1__0__Impl : ( ( rule__Topology__JointAssignment_1_0 ) ) ;
    public final void rule__Topology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Topology__JointAssignment_1_0 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            // InternalMyDsl.g:494:2: ( rule__Topology__JointAssignment_1_0 )
            {
             before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 
            // InternalMyDsl.g:495:2: ( rule__Topology__JointAssignment_1_0 )
            // InternalMyDsl.g:495:3: rule__Topology__JointAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__JointAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group_1__0__Impl"


    // $ANTLR start "rule__Topology__Group_1__1"
    // InternalMyDsl.g:503:1: rule__Topology__Group_1__1 : rule__Topology__Group_1__1__Impl ;
    public final void rule__Topology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Topology__Group_1__1__Impl )
            // InternalMyDsl.g:508:2: rule__Topology__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group_1__1"


    // $ANTLR start "rule__Topology__Group_1__1__Impl"
    // InternalMyDsl.g:514:1: rule__Topology__Group_1__1__Impl : ( ( rule__Topology__ChildAssignment_1_1 ) ) ;
    public final void rule__Topology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( ( ( rule__Topology__ChildAssignment_1_1 ) ) )
            // InternalMyDsl.g:519:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            {
            // InternalMyDsl.g:519:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            // InternalMyDsl.g:520:2: ( rule__Topology__ChildAssignment_1_1 )
            {
             before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 
            // InternalMyDsl.g:521:2: ( rule__Topology__ChildAssignment_1_1 )
            // InternalMyDsl.g:521:3: rule__Topology__ChildAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Topology__ChildAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Group_1__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:530:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:535:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:542:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( 'Link' ) )
            // InternalMyDsl.g:547:1: ( 'Link' )
            {
            // InternalMyDsl.g:547:1: ( 'Link' )
            // InternalMyDsl.g:548:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:557:1: rule__Link__Group__1 : rule__Link__Group__1__Impl ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Link__Group__1__Impl )
            // InternalMyDsl.g:562:2: rule__Link__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:568:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:573:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:573:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:574:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:575:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:575:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalMyDsl.g:584:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:589:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalMyDsl.g:596:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:601:1: ( 'Joint' )
            {
            // InternalMyDsl.g:601:1: ( 'Joint' )
            // InternalMyDsl.g:602:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalMyDsl.g:611:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:616:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalMyDsl.g:623:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:628:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:628:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:629:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:630:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:630:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalMyDsl.g:638:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalMyDsl.g:643:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalMyDsl.g:650:1: rule__Joint__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( ( 'Type' ) )
            // InternalMyDsl.g:655:1: ( 'Type' )
            {
            // InternalMyDsl.g:655:1: ( 'Type' )
            // InternalMyDsl.g:656:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalMyDsl.g:665:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalMyDsl.g:670:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalMyDsl.g:677:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:682:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:682:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // InternalMyDsl.g:683:2: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:684:2: ( rule__Joint__TypeAssignment_3 )
            // InternalMyDsl.g:684:3: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalMyDsl.g:692:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalMyDsl.g:697:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalMyDsl.g:704:1: rule__Joint__Group__4__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:709:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:709:1: ( 'ChildOf' )
            // InternalMyDsl.g:710:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalMyDsl.g:719:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalMyDsl.g:724:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalMyDsl.g:731:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__ChildOfAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:735:1: ( ( ( rule__Joint__ChildOfAssignment_5 ) ) )
            // InternalMyDsl.g:736:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            {
            // InternalMyDsl.g:736:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            // InternalMyDsl.g:737:2: ( rule__Joint__ChildOfAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_5()); 
            // InternalMyDsl.g:738:2: ( rule__Joint__ChildOfAssignment_5 )
            // InternalMyDsl.g:738:3: rule__Joint__ChildOfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalMyDsl.g:746:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalMyDsl.g:751:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalMyDsl.g:758:1: rule__Joint__Group__6__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:763:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:763:1: ( 'ParentOf' )
            // InternalMyDsl.g:764:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalMyDsl.g:773:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( rule__Joint__Group__7__Impl )
            // InternalMyDsl.g:778:2: rule__Joint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalMyDsl.g:784:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentOfAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( ( ( rule__Joint__ParentOfAssignment_7 ) ) )
            // InternalMyDsl.g:789:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            {
            // InternalMyDsl.g:789:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            // InternalMyDsl.g:790:2: ( rule__Joint__ParentOfAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_7()); 
            // InternalMyDsl.g:791:2: ( rule__Joint__ParentOfAssignment_7 )
            // InternalMyDsl.g:791:3: rule__Joint__ParentOfAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalMyDsl.g:800:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:805:2: ( RULE_ID )
            {
            // InternalMyDsl.g:805:2: ( RULE_ID )
            // InternalMyDsl.g:806:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__TopologiesAssignment_3"
    // InternalMyDsl.g:815:1: rule__Robot__TopologiesAssignment_3 : ( ruleTopology ) ;
    public final void rule__Robot__TopologiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:820:2: ( ruleTopology )
            {
            // InternalMyDsl.g:820:2: ( ruleTopology )
            // InternalMyDsl.g:821:3: ruleTopology
            {
             before(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__TopologiesAssignment_3"


    // $ANTLR start "rule__Robot__LinkAssignment_4_0"
    // InternalMyDsl.g:830:1: rule__Robot__LinkAssignment_4_0 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( ruleLink ) )
            // InternalMyDsl.g:835:2: ( ruleLink )
            {
            // InternalMyDsl.g:835:2: ( ruleLink )
            // InternalMyDsl.g:836:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_4_0"


    // $ANTLR start "rule__Robot__JointAssignment_4_1"
    // InternalMyDsl.g:845:1: rule__Robot__JointAssignment_4_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:850:2: ( ruleJoint )
            {
            // InternalMyDsl.g:850:2: ( ruleJoint )
            // InternalMyDsl.g:851:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_4_1"


    // $ANTLR start "rule__Topology__ParentAssignment_0"
    // InternalMyDsl.g:860:1: rule__Topology__ParentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Topology__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:865:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:865:2: ( RULE_STRING )
            // InternalMyDsl.g:866:3: RULE_STRING
            {
             before(grammarAccess.getTopologyAccess().getParentSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopologyAccess().getParentSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__ParentAssignment_0"


    // $ANTLR start "rule__Topology__JointAssignment_1_0"
    // InternalMyDsl.g:875:1: rule__Topology__JointAssignment_1_0 : ( ruleJointRef ) ;
    public final void rule__Topology__JointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( ruleJointRef ) )
            // InternalMyDsl.g:880:2: ( ruleJointRef )
            {
            // InternalMyDsl.g:880:2: ( ruleJointRef )
            // InternalMyDsl.g:881:3: ruleJointRef
            {
             before(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJointRef();

            state._fsp--;

             after(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__JointAssignment_1_0"


    // $ANTLR start "rule__Topology__ChildAssignment_1_1"
    // InternalMyDsl.g:890:1: rule__Topology__ChildAssignment_1_1 : ( ruleTopology ) ;
    public final void rule__Topology__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:895:2: ( ruleTopology )
            {
            // InternalMyDsl.g:895:2: ( ruleTopology )
            // InternalMyDsl.g:896:3: ruleTopology
            {
             before(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__ChildAssignment_1_1"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalMyDsl.g:905:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:910:2: ( RULE_ID )
            {
            // InternalMyDsl.g:910:2: ( RULE_ID )
            // InternalMyDsl.g:911:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalMyDsl.g:920:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:925:2: ( RULE_ID )
            {
            // InternalMyDsl.g:925:2: ( RULE_ID )
            // InternalMyDsl.g:926:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_3"
    // InternalMyDsl.g:935:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:940:2: ( ruleJointType )
            {
            // InternalMyDsl.g:940:2: ( ruleJointType )
            // InternalMyDsl.g:941:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_3"


    // $ANTLR start "rule__Joint__ChildOfAssignment_5"
    // InternalMyDsl.g:950:1: rule__Joint__ChildOfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:955:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:955:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:956:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 
            // InternalMyDsl.g:957:3: ( RULE_ID )
            // InternalMyDsl.g:958:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_5"


    // $ANTLR start "rule__Joint__ParentOfAssignment_7"
    // InternalMyDsl.g:969:1: rule__Joint__ParentOfAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:974:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:974:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:975:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 
            // InternalMyDsl.g:976:3: ( RULE_ID )
            // InternalMyDsl.g:977:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_7"


    // $ANTLR start "rule__JointRef__FixAssignment_0"
    // InternalMyDsl.g:988:1: rule__JointRef__FixAssignment_0 : ( ( '->' ) ) ;
    public final void rule__JointRef__FixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( ( '->' ) ) )
            // InternalMyDsl.g:993:2: ( ( '->' ) )
            {
            // InternalMyDsl.g:993:2: ( ( '->' ) )
            // InternalMyDsl.g:994:3: ( '->' )
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            // InternalMyDsl.g:995:3: ( '->' )
            // InternalMyDsl.g:996:4: '->'
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 

            }

             after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointRef__FixAssignment_0"


    // $ANTLR start "rule__JointRef__RevAssignment_1"
    // InternalMyDsl.g:1007:1: rule__JointRef__RevAssignment_1 : ( ( 'r->' ) ) ;
    public final void rule__JointRef__RevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( 'r->' ) ) )
            // InternalMyDsl.g:1012:2: ( ( 'r->' ) )
            {
            // InternalMyDsl.g:1012:2: ( ( 'r->' ) )
            // InternalMyDsl.g:1013:3: ( 'r->' )
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            // InternalMyDsl.g:1014:3: ( 'r->' )
            // InternalMyDsl.g:1015:4: 'r->'
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 

            }

             after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointRef__RevAssignment_1"


    // $ANTLR start "rule__JointRef__PrisAssignment_2"
    // InternalMyDsl.g:1026:1: rule__JointRef__PrisAssignment_2 : ( ( 'p->' ) ) ;
    public final void rule__JointRef__PrisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ( 'p->' ) ) )
            // InternalMyDsl.g:1031:2: ( ( 'p->' ) )
            {
            // InternalMyDsl.g:1031:2: ( ( 'p->' ) )
            // InternalMyDsl.g:1032:3: ( 'p->' )
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            // InternalMyDsl.g:1033:3: ( 'p->' )
            // InternalMyDsl.g:1034:4: 'p->'
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 

            }

             after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointRef__PrisAssignment_2"


    // $ANTLR start "rule__JointRef__ContAssignment_3"
    // InternalMyDsl.g:1045:1: rule__JointRef__ContAssignment_3 : ( ( 'c->' ) ) ;
    public final void rule__JointRef__ContAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ( 'c->' ) ) )
            // InternalMyDsl.g:1050:2: ( ( 'c->' ) )
            {
            // InternalMyDsl.g:1050:2: ( ( 'c->' ) )
            // InternalMyDsl.g:1051:3: ( 'c->' )
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            // InternalMyDsl.g:1052:3: ( 'c->' )
            // InternalMyDsl.g:1053:4: 'c->'
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 

            }

             after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointRef__ContAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}