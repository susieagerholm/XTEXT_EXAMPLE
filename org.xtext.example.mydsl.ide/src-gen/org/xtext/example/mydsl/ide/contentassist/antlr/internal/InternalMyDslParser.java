package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'", "'Robot'", "'Topology'", "'Link'", "'isReuseOf'", "'add_to'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Origin'", "'xyz'", "'roll_pitch_yaw'", "'Mass'", "'massValueInKilograms'", "'->'", "'r->'", "'p->'", "'c->'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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


    // $ANTLR start "entryRuleLinkDecorator"
    // InternalMyDsl.g:128:1: entryRuleLinkDecorator : ruleLinkDecorator EOF ;
    public final void entryRuleLinkDecorator() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleLinkDecorator EOF )
            // InternalMyDsl.g:130:1: ruleLinkDecorator EOF
            {
             before(grammarAccess.getLinkDecoratorRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkDecorator();

            state._fsp--;

             after(grammarAccess.getLinkDecoratorRule()); 
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
    // $ANTLR end "entryRuleLinkDecorator"


    // $ANTLR start "ruleLinkDecorator"
    // InternalMyDsl.g:137:1: ruleLinkDecorator : ( ( rule__LinkDecorator__Group__0 ) ) ;
    public final void ruleLinkDecorator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__LinkDecorator__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__LinkDecorator__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__LinkDecorator__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__LinkDecorator__Group__0 )
            {
             before(grammarAccess.getLinkDecoratorAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__LinkDecorator__Group__0 )
            // InternalMyDsl.g:144:4: rule__LinkDecorator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkDecorator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkDecoratorAccess().getGroup()); 

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
    // $ANTLR end "ruleLinkDecorator"


    // $ANTLR start "entryRuleLinkRef"
    // InternalMyDsl.g:153:1: entryRuleLinkRef : ruleLinkRef EOF ;
    public final void entryRuleLinkRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLinkRef EOF )
            // InternalMyDsl.g:155:1: ruleLinkRef EOF
            {
             before(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkRef();

            state._fsp--;

             after(grammarAccess.getLinkRefRule()); 
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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalMyDsl.g:162:1: ruleLinkRef : ( ( rule__LinkRef__Group__0 ) ) ;
    public final void ruleLinkRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__LinkRef__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__LinkRef__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__LinkRef__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__LinkRef__Group__0 )
            {
             before(grammarAccess.getLinkRefAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__LinkRef__Group__0 )
            // InternalMyDsl.g:169:4: rule__LinkRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getGroup()); 

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
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:178:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleJoint EOF )
            // InternalMyDsl.g:180:1: ruleJoint EOF
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
    // InternalMyDsl.g:187:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:194:4: rule__Joint__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleJointRef : ruleJointRef EOF ;
    public final void entryRuleJointRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleJointRef EOF )
            // InternalMyDsl.g:205:1: ruleJointRef EOF
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
    // InternalMyDsl.g:212:1: ruleJointRef : ( ( rule__JointRef__Alternatives ) ) ;
    public final void ruleJointRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__JointRef__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__JointRef__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__JointRef__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__JointRef__Alternatives )
            {
             before(grammarAccess.getJointRefAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__JointRef__Alternatives )
            // InternalMyDsl.g:219:4: rule__JointRef__Alternatives
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


    // $ANTLR start "entryRuleInertia"
    // InternalMyDsl.g:228:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInertia EOF )
            // InternalMyDsl.g:230:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
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
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalMyDsl.g:237:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Inertia__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Inertia__Group__0 )
            // InternalMyDsl.g:244:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleOrigin"
    // InternalMyDsl.g:253:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleOrigin EOF )
            // InternalMyDsl.g:255:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
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
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalMyDsl.g:262:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Origin__Group__0 )
            // InternalMyDsl.g:269:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalMyDsl.g:278:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMass EOF )
            // InternalMyDsl.g:280:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalMyDsl.g:287:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Mass__Group__0 )
            // InternalMyDsl.g:294:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

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
    // $ANTLR end "ruleMass"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:303:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:307:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:308:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:308:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:309:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:310:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:310:4: rule__JointType__Alternatives
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
    // InternalMyDsl.g:318:1: rule__Robot__Alternatives_4 : ( ( ( rule__Robot__LinkAssignment_4_0 ) ) | ( ( rule__Robot__JointAssignment_4_1 ) ) | ( ( rule__Robot__LinkrefsAssignment_4_2 ) ) );
    public final void rule__Robot__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ( rule__Robot__LinkAssignment_4_0 ) ) | ( ( rule__Robot__JointAssignment_4_1 ) ) | ( ( rule__Robot__LinkrefsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:323:2: ( ( rule__Robot__LinkAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:323:2: ( ( rule__Robot__LinkAssignment_4_0 ) )
                    // InternalMyDsl.g:324:3: ( rule__Robot__LinkAssignment_4_0 )
                    {
                     before(grammarAccess.getRobotAccess().getLinkAssignment_4_0()); 
                    // InternalMyDsl.g:325:3: ( rule__Robot__LinkAssignment_4_0 )
                    // InternalMyDsl.g:325:4: rule__Robot__LinkAssignment_4_0
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
                    // InternalMyDsl.g:329:2: ( ( rule__Robot__JointAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:329:2: ( ( rule__Robot__JointAssignment_4_1 ) )
                    // InternalMyDsl.g:330:3: ( rule__Robot__JointAssignment_4_1 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 
                    // InternalMyDsl.g:331:3: ( rule__Robot__JointAssignment_4_1 )
                    // InternalMyDsl.g:331:4: rule__Robot__JointAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:335:2: ( ( rule__Robot__LinkrefsAssignment_4_2 ) )
                    {
                    // InternalMyDsl.g:335:2: ( ( rule__Robot__LinkrefsAssignment_4_2 ) )
                    // InternalMyDsl.g:336:3: ( rule__Robot__LinkrefsAssignment_4_2 )
                    {
                     before(grammarAccess.getRobotAccess().getLinkrefsAssignment_4_2()); 
                    // InternalMyDsl.g:337:3: ( rule__Robot__LinkrefsAssignment_4_2 )
                    // InternalMyDsl.g:337:4: rule__Robot__LinkrefsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__LinkrefsAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getLinkrefsAssignment_4_2()); 

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
    // InternalMyDsl.g:345:1: rule__JointRef__Alternatives : ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) );
    public final void rule__JointRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 39:
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
                    // InternalMyDsl.g:350:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    {
                    // InternalMyDsl.g:350:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    // InternalMyDsl.g:351:3: ( rule__JointRef__FixAssignment_0 )
                    {
                     before(grammarAccess.getJointRefAccess().getFixAssignment_0()); 
                    // InternalMyDsl.g:352:3: ( rule__JointRef__FixAssignment_0 )
                    // InternalMyDsl.g:352:4: rule__JointRef__FixAssignment_0
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
                    // InternalMyDsl.g:356:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    {
                    // InternalMyDsl.g:356:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    // InternalMyDsl.g:357:3: ( rule__JointRef__RevAssignment_1 )
                    {
                     before(grammarAccess.getJointRefAccess().getRevAssignment_1()); 
                    // InternalMyDsl.g:358:3: ( rule__JointRef__RevAssignment_1 )
                    // InternalMyDsl.g:358:4: rule__JointRef__RevAssignment_1
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
                    // InternalMyDsl.g:362:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    {
                    // InternalMyDsl.g:362:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    // InternalMyDsl.g:363:3: ( rule__JointRef__PrisAssignment_2 )
                    {
                     before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 
                    // InternalMyDsl.g:364:3: ( rule__JointRef__PrisAssignment_2 )
                    // InternalMyDsl.g:364:4: rule__JointRef__PrisAssignment_2
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
                    // InternalMyDsl.g:368:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    {
                    // InternalMyDsl.g:368:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    // InternalMyDsl.g:369:3: ( rule__JointRef__ContAssignment_3 )
                    {
                     before(grammarAccess.getJointRefAccess().getContAssignment_3()); 
                    // InternalMyDsl.g:370:3: ( rule__JointRef__ContAssignment_3 )
                    // InternalMyDsl.g:370:4: rule__JointRef__ContAssignment_3
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
    // InternalMyDsl.g:378:1: rule__JointType__Alternatives : ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:382:1: ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) )
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
                    // InternalMyDsl.g:383:2: ( ( 'Fixed' ) )
                    {
                    // InternalMyDsl.g:383:2: ( ( 'Fixed' ) )
                    // InternalMyDsl.g:384:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:385:3: ( 'Fixed' )
                    // InternalMyDsl.g:385:4: 'Fixed'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:389:2: ( ( 'Revolute' ) )
                    {
                    // InternalMyDsl.g:389:2: ( ( 'Revolute' ) )
                    // InternalMyDsl.g:390:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:391:3: ( 'Revolute' )
                    // InternalMyDsl.g:391:4: 'Revolute'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:395:2: ( ( 'Prismatic' ) )
                    {
                    // InternalMyDsl.g:395:2: ( ( 'Prismatic' ) )
                    // InternalMyDsl.g:396:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:397:3: ( 'Prismatic' )
                    // InternalMyDsl.g:397:4: 'Prismatic'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:401:2: ( ( 'Continuous' ) )
                    {
                    // InternalMyDsl.g:401:2: ( ( 'Continuous' ) )
                    // InternalMyDsl.g:402:3: ( 'Continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:403:3: ( 'Continuous' )
                    // InternalMyDsl.g:403:4: 'Continuous'
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
    // InternalMyDsl.g:411:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:415:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:416:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:423:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:428:1: ( 'Robot' )
            {
            // InternalMyDsl.g:428:1: ( 'Robot' )
            // InternalMyDsl.g:429:2: 'Robot'
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
    // InternalMyDsl.g:438:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:443:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:450:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:455:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:455:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:456:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:457:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:457:3: rule__Robot__NameAssignment_1
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
    // InternalMyDsl.g:465:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:470:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:477:1: rule__Robot__Group__2__Impl : ( 'Topology' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( 'Topology' ) )
            // InternalMyDsl.g:482:1: ( 'Topology' )
            {
            // InternalMyDsl.g:482:1: ( 'Topology' )
            // InternalMyDsl.g:483:2: 'Topology'
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
    // InternalMyDsl.g:492:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:497:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:504:1: rule__Robot__Group__3__Impl : ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) ) )
            // InternalMyDsl.g:509:1: ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) )
            {
            // InternalMyDsl.g:509:1: ( ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* ) )
            // InternalMyDsl.g:510:2: ( ( rule__Robot__TopologiesAssignment_3 ) ) ( ( rule__Robot__TopologiesAssignment_3 )* )
            {
            // InternalMyDsl.g:510:2: ( ( rule__Robot__TopologiesAssignment_3 ) )
            // InternalMyDsl.g:511:3: ( rule__Robot__TopologiesAssignment_3 )
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 
            // InternalMyDsl.g:512:3: ( rule__Robot__TopologiesAssignment_3 )
            // InternalMyDsl.g:512:4: rule__Robot__TopologiesAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Robot__TopologiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 

            }

            // InternalMyDsl.g:515:2: ( ( rule__Robot__TopologiesAssignment_3 )* )
            // InternalMyDsl.g:516:3: ( rule__Robot__TopologiesAssignment_3 )*
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_3()); 
            // InternalMyDsl.g:517:3: ( rule__Robot__TopologiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:517:4: rule__Robot__TopologiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:526:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Robot__Group__4__Impl )
            // InternalMyDsl.g:531:2: rule__Robot__Group__4__Impl
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
    // InternalMyDsl.g:537:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__Alternatives_4 )* ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( rule__Robot__Alternatives_4 )* ) )
            // InternalMyDsl.g:542:1: ( ( rule__Robot__Alternatives_4 )* )
            {
            // InternalMyDsl.g:542:1: ( ( rule__Robot__Alternatives_4 )* )
            // InternalMyDsl.g:543:2: ( rule__Robot__Alternatives_4 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_4()); 
            // InternalMyDsl.g:544:2: ( rule__Robot__Alternatives_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||(LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:544:3: rule__Robot__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:553:1: rule__Topology__Group__0 : rule__Topology__Group__0__Impl rule__Topology__Group__1 ;
    public final void rule__Topology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Topology__Group__0__Impl rule__Topology__Group__1 )
            // InternalMyDsl.g:558:2: rule__Topology__Group__0__Impl rule__Topology__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:565:1: rule__Topology__Group__0__Impl : ( ( rule__Topology__ParentAssignment_0 ) ) ;
    public final void rule__Topology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ( rule__Topology__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:570:1: ( ( rule__Topology__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:570:1: ( ( rule__Topology__ParentAssignment_0 ) )
            // InternalMyDsl.g:571:2: ( rule__Topology__ParentAssignment_0 )
            {
             before(grammarAccess.getTopologyAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:572:2: ( rule__Topology__ParentAssignment_0 )
            // InternalMyDsl.g:572:3: rule__Topology__ParentAssignment_0
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
    // InternalMyDsl.g:580:1: rule__Topology__Group__1 : rule__Topology__Group__1__Impl ;
    public final void rule__Topology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Topology__Group__1__Impl )
            // InternalMyDsl.g:585:2: rule__Topology__Group__1__Impl
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
    // InternalMyDsl.g:591:1: rule__Topology__Group__1__Impl : ( ( rule__Topology__Group_1__0 )? ) ;
    public final void rule__Topology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( ( rule__Topology__Group_1__0 )? ) )
            // InternalMyDsl.g:596:1: ( ( rule__Topology__Group_1__0 )? )
            {
            // InternalMyDsl.g:596:1: ( ( rule__Topology__Group_1__0 )? )
            // InternalMyDsl.g:597:2: ( rule__Topology__Group_1__0 )?
            {
             before(grammarAccess.getTopologyAccess().getGroup_1()); 
            // InternalMyDsl.g:598:2: ( rule__Topology__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=36 && LA6_0<=39)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:598:3: rule__Topology__Group_1__0
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
    // InternalMyDsl.g:607:1: rule__Topology__Group_1__0 : rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 ;
    public final void rule__Topology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 )
            // InternalMyDsl.g:612:2: rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:619:1: rule__Topology__Group_1__0__Impl : ( ( rule__Topology__JointAssignment_1_0 ) ) ;
    public final void rule__Topology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__Topology__JointAssignment_1_0 ) ) )
            // InternalMyDsl.g:624:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            {
            // InternalMyDsl.g:624:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            // InternalMyDsl.g:625:2: ( rule__Topology__JointAssignment_1_0 )
            {
             before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 
            // InternalMyDsl.g:626:2: ( rule__Topology__JointAssignment_1_0 )
            // InternalMyDsl.g:626:3: rule__Topology__JointAssignment_1_0
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
    // InternalMyDsl.g:634:1: rule__Topology__Group_1__1 : rule__Topology__Group_1__1__Impl ;
    public final void rule__Topology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Topology__Group_1__1__Impl )
            // InternalMyDsl.g:639:2: rule__Topology__Group_1__1__Impl
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
    // InternalMyDsl.g:645:1: rule__Topology__Group_1__1__Impl : ( ( rule__Topology__ChildAssignment_1_1 ) ) ;
    public final void rule__Topology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( ( rule__Topology__ChildAssignment_1_1 ) ) )
            // InternalMyDsl.g:650:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            {
            // InternalMyDsl.g:650:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            // InternalMyDsl.g:651:2: ( rule__Topology__ChildAssignment_1_1 )
            {
             before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 
            // InternalMyDsl.g:652:2: ( rule__Topology__ChildAssignment_1_1 )
            // InternalMyDsl.g:652:3: rule__Topology__ChildAssignment_1_1
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
    // InternalMyDsl.g:661:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:666:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalMyDsl.g:673:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( 'Link' ) )
            // InternalMyDsl.g:678:1: ( 'Link' )
            {
            // InternalMyDsl.g:678:1: ( 'Link' )
            // InternalMyDsl.g:679:2: 'Link'
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
    // InternalMyDsl.g:688:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:693:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // InternalMyDsl.g:700:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:705:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:706:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:707:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:707:3: rule__Link__NameAssignment_1
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


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:715:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:720:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:727:1: rule__Link__Group__2__Impl : ( ( rule__Link__Group_2__0 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( ( rule__Link__Group_2__0 )? ) )
            // InternalMyDsl.g:732:1: ( ( rule__Link__Group_2__0 )? )
            {
            // InternalMyDsl.g:732:1: ( ( rule__Link__Group_2__0 )? )
            // InternalMyDsl.g:733:2: ( rule__Link__Group_2__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_2()); 
            // InternalMyDsl.g:734:2: ( rule__Link__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:734:3: rule__Link__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:742:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:747:2: rule__Link__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__3__Impl();

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
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:753:1: rule__Link__Group__3__Impl : ( ( rule__Link__DecoratorAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( ( rule__Link__DecoratorAssignment_3 ) ) )
            // InternalMyDsl.g:758:1: ( ( rule__Link__DecoratorAssignment_3 ) )
            {
            // InternalMyDsl.g:758:1: ( ( rule__Link__DecoratorAssignment_3 ) )
            // InternalMyDsl.g:759:2: ( rule__Link__DecoratorAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getDecoratorAssignment_3()); 
            // InternalMyDsl.g:760:2: ( rule__Link__DecoratorAssignment_3 )
            // InternalMyDsl.g:760:3: rule__Link__DecoratorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__DecoratorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getDecoratorAssignment_3()); 

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
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group_2__0"
    // InternalMyDsl.g:769:1: rule__Link__Group_2__0 : rule__Link__Group_2__0__Impl rule__Link__Group_2__1 ;
    public final void rule__Link__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Link__Group_2__0__Impl rule__Link__Group_2__1 )
            // InternalMyDsl.g:774:2: rule__Link__Group_2__0__Impl rule__Link__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_2__1();

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
    // $ANTLR end "rule__Link__Group_2__0"


    // $ANTLR start "rule__Link__Group_2__0__Impl"
    // InternalMyDsl.g:781:1: rule__Link__Group_2__0__Impl : ( 'isReuseOf' ) ;
    public final void rule__Link__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( 'isReuseOf' ) )
            // InternalMyDsl.g:786:1: ( 'isReuseOf' )
            {
            // InternalMyDsl.g:786:1: ( 'isReuseOf' )
            // InternalMyDsl.g:787:2: 'isReuseOf'
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getIsReuseOfKeyword_2_0()); 

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
    // $ANTLR end "rule__Link__Group_2__0__Impl"


    // $ANTLR start "rule__Link__Group_2__1"
    // InternalMyDsl.g:796:1: rule__Link__Group_2__1 : rule__Link__Group_2__1__Impl ;
    public final void rule__Link__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Link__Group_2__1__Impl )
            // InternalMyDsl.g:801:2: rule__Link__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_2__1__Impl();

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
    // $ANTLR end "rule__Link__Group_2__1"


    // $ANTLR start "rule__Link__Group_2__1__Impl"
    // InternalMyDsl.g:807:1: rule__Link__Group_2__1__Impl : ( ( rule__Link__IsReuseOfAssignment_2_1 ) ) ;
    public final void rule__Link__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( ( rule__Link__IsReuseOfAssignment_2_1 ) ) )
            // InternalMyDsl.g:812:1: ( ( rule__Link__IsReuseOfAssignment_2_1 ) )
            {
            // InternalMyDsl.g:812:1: ( ( rule__Link__IsReuseOfAssignment_2_1 ) )
            // InternalMyDsl.g:813:2: ( rule__Link__IsReuseOfAssignment_2_1 )
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfAssignment_2_1()); 
            // InternalMyDsl.g:814:2: ( rule__Link__IsReuseOfAssignment_2_1 )
            // InternalMyDsl.g:814:3: rule__Link__IsReuseOfAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__IsReuseOfAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getIsReuseOfAssignment_2_1()); 

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
    // $ANTLR end "rule__Link__Group_2__1__Impl"


    // $ANTLR start "rule__LinkDecorator__Group__0"
    // InternalMyDsl.g:823:1: rule__LinkDecorator__Group__0 : rule__LinkDecorator__Group__0__Impl rule__LinkDecorator__Group__1 ;
    public final void rule__LinkDecorator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__LinkDecorator__Group__0__Impl rule__LinkDecorator__Group__1 )
            // InternalMyDsl.g:828:2: rule__LinkDecorator__Group__0__Impl rule__LinkDecorator__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LinkDecorator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkDecorator__Group__1();

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
    // $ANTLR end "rule__LinkDecorator__Group__0"


    // $ANTLR start "rule__LinkDecorator__Group__0__Impl"
    // InternalMyDsl.g:835:1: rule__LinkDecorator__Group__0__Impl : ( () ) ;
    public final void rule__LinkDecorator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( () ) )
            // InternalMyDsl.g:840:1: ( () )
            {
            // InternalMyDsl.g:840:1: ( () )
            // InternalMyDsl.g:841:2: ()
            {
             before(grammarAccess.getLinkDecoratorAccess().getLinkDecoratorAction_0()); 
            // InternalMyDsl.g:842:2: ()
            // InternalMyDsl.g:842:3: 
            {
            }

             after(grammarAccess.getLinkDecoratorAccess().getLinkDecoratorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkDecorator__Group__0__Impl"


    // $ANTLR start "rule__LinkDecorator__Group__1"
    // InternalMyDsl.g:850:1: rule__LinkDecorator__Group__1 : rule__LinkDecorator__Group__1__Impl ;
    public final void rule__LinkDecorator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__LinkDecorator__Group__1__Impl )
            // InternalMyDsl.g:855:2: rule__LinkDecorator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkDecorator__Group__1__Impl();

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
    // $ANTLR end "rule__LinkDecorator__Group__1"


    // $ANTLR start "rule__LinkDecorator__Group__1__Impl"
    // InternalMyDsl.g:861:1: rule__LinkDecorator__Group__1__Impl : ( ( rule__LinkDecorator__InertAssignment_1 )* ) ;
    public final void rule__LinkDecorator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( ( ( rule__LinkDecorator__InertAssignment_1 )* ) )
            // InternalMyDsl.g:866:1: ( ( rule__LinkDecorator__InertAssignment_1 )* )
            {
            // InternalMyDsl.g:866:1: ( ( rule__LinkDecorator__InertAssignment_1 )* )
            // InternalMyDsl.g:867:2: ( rule__LinkDecorator__InertAssignment_1 )*
            {
             before(grammarAccess.getLinkDecoratorAccess().getInertAssignment_1()); 
            // InternalMyDsl.g:868:2: ( rule__LinkDecorator__InertAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:868:3: rule__LinkDecorator__InertAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LinkDecorator__InertAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLinkDecoratorAccess().getInertAssignment_1()); 

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
    // $ANTLR end "rule__LinkDecorator__Group__1__Impl"


    // $ANTLR start "rule__LinkRef__Group__0"
    // InternalMyDsl.g:877:1: rule__LinkRef__Group__0 : rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1 ;
    public final void rule__LinkRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1 )
            // InternalMyDsl.g:882:2: rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LinkRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__1();

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
    // $ANTLR end "rule__LinkRef__Group__0"


    // $ANTLR start "rule__LinkRef__Group__0__Impl"
    // InternalMyDsl.g:889:1: rule__LinkRef__Group__0__Impl : ( 'add_to' ) ;
    public final void rule__LinkRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( 'add_to' ) )
            // InternalMyDsl.g:894:1: ( 'add_to' )
            {
            // InternalMyDsl.g:894:1: ( 'add_to' )
            // InternalMyDsl.g:895:2: 'add_to'
            {
             before(grammarAccess.getLinkRefAccess().getAdd_toKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getAdd_toKeyword_0()); 

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
    // $ANTLR end "rule__LinkRef__Group__0__Impl"


    // $ANTLR start "rule__LinkRef__Group__1"
    // InternalMyDsl.g:904:1: rule__LinkRef__Group__1 : rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2 ;
    public final void rule__LinkRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2 )
            // InternalMyDsl.g:909:2: rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LinkRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__2();

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
    // $ANTLR end "rule__LinkRef__Group__1"


    // $ANTLR start "rule__LinkRef__Group__1__Impl"
    // InternalMyDsl.g:916:1: rule__LinkRef__Group__1__Impl : ( ( rule__LinkRef__RefAssignment_1 ) ) ;
    public final void rule__LinkRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__LinkRef__RefAssignment_1 ) ) )
            // InternalMyDsl.g:921:1: ( ( rule__LinkRef__RefAssignment_1 ) )
            {
            // InternalMyDsl.g:921:1: ( ( rule__LinkRef__RefAssignment_1 ) )
            // InternalMyDsl.g:922:2: ( rule__LinkRef__RefAssignment_1 )
            {
             before(grammarAccess.getLinkRefAccess().getRefAssignment_1()); 
            // InternalMyDsl.g:923:2: ( rule__LinkRef__RefAssignment_1 )
            // InternalMyDsl.g:923:3: rule__LinkRef__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__LinkRef__Group__1__Impl"


    // $ANTLR start "rule__LinkRef__Group__2"
    // InternalMyDsl.g:931:1: rule__LinkRef__Group__2 : rule__LinkRef__Group__2__Impl ;
    public final void rule__LinkRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__LinkRef__Group__2__Impl )
            // InternalMyDsl.g:936:2: rule__LinkRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__2__Impl();

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
    // $ANTLR end "rule__LinkRef__Group__2"


    // $ANTLR start "rule__LinkRef__Group__2__Impl"
    // InternalMyDsl.g:942:1: rule__LinkRef__Group__2__Impl : ( ( rule__LinkRef__DecoratorAssignment_2 ) ) ;
    public final void rule__LinkRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( ( rule__LinkRef__DecoratorAssignment_2 ) ) )
            // InternalMyDsl.g:947:1: ( ( rule__LinkRef__DecoratorAssignment_2 ) )
            {
            // InternalMyDsl.g:947:1: ( ( rule__LinkRef__DecoratorAssignment_2 ) )
            // InternalMyDsl.g:948:2: ( rule__LinkRef__DecoratorAssignment_2 )
            {
             before(grammarAccess.getLinkRefAccess().getDecoratorAssignment_2()); 
            // InternalMyDsl.g:949:2: ( rule__LinkRef__DecoratorAssignment_2 )
            // InternalMyDsl.g:949:3: rule__LinkRef__DecoratorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__DecoratorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getDecoratorAssignment_2()); 

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
    // $ANTLR end "rule__LinkRef__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalMyDsl.g:958:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:963:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalMyDsl.g:970:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:975:1: ( 'Joint' )
            {
            // InternalMyDsl.g:975:1: ( 'Joint' )
            // InternalMyDsl.g:976:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:985:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:990:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:997:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1002:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1002:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:1003:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1004:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:1004:3: rule__Joint__NameAssignment_1
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
    // InternalMyDsl.g:1012:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalMyDsl.g:1017:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
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
    // InternalMyDsl.g:1024:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Group_2__0 )? ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ( rule__Joint__Group_2__0 )? ) )
            // InternalMyDsl.g:1029:1: ( ( rule__Joint__Group_2__0 )? )
            {
            // InternalMyDsl.g:1029:1: ( ( rule__Joint__Group_2__0 )? )
            // InternalMyDsl.g:1030:2: ( rule__Joint__Group_2__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_2()); 
            // InternalMyDsl.g:1031:2: ( rule__Joint__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1031:3: rule__Joint__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_2()); 

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
    // InternalMyDsl.g:1039:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalMyDsl.g:1044:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1051:1: rule__Joint__Group__3__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:1056:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:1056:1: ( 'ChildOf' )
            // InternalMyDsl.g:1057:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_3()); 

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
    // InternalMyDsl.g:1066:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalMyDsl.g:1071:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1078:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ChildOfAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ( rule__Joint__ChildOfAssignment_4 ) ) )
            // InternalMyDsl.g:1083:1: ( ( rule__Joint__ChildOfAssignment_4 ) )
            {
            // InternalMyDsl.g:1083:1: ( ( rule__Joint__ChildOfAssignment_4 ) )
            // InternalMyDsl.g:1084:2: ( rule__Joint__ChildOfAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_4()); 
            // InternalMyDsl.g:1085:2: ( rule__Joint__ChildOfAssignment_4 )
            // InternalMyDsl.g:1085:3: rule__Joint__ChildOfAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_4()); 

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
    // InternalMyDsl.g:1093:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalMyDsl.g:1098:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1105:1: rule__Joint__Group__5__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:1110:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:1110:1: ( 'ParentOf' )
            // InternalMyDsl.g:1111:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_5()); 

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
    // InternalMyDsl.g:1120:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalMyDsl.g:1125:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1132:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ParentOfAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( rule__Joint__ParentOfAssignment_6 ) ) )
            // InternalMyDsl.g:1137:1: ( ( rule__Joint__ParentOfAssignment_6 ) )
            {
            // InternalMyDsl.g:1137:1: ( ( rule__Joint__ParentOfAssignment_6 ) )
            // InternalMyDsl.g:1138:2: ( rule__Joint__ParentOfAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_6()); 
            // InternalMyDsl.g:1139:2: ( rule__Joint__ParentOfAssignment_6 )
            // InternalMyDsl.g:1139:3: rule__Joint__ParentOfAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_6()); 

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
    // InternalMyDsl.g:1147:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalMyDsl.g:1152:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

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
    // InternalMyDsl.g:1159:1: rule__Joint__Group__7__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( 'Type' ) )
            // InternalMyDsl.g:1164:1: ( 'Type' )
            {
            // InternalMyDsl.g:1164:1: ( 'Type' )
            // InternalMyDsl.g:1165:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_7()); 

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


    // $ANTLR start "rule__Joint__Group__8"
    // InternalMyDsl.g:1174:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Joint__Group__8__Impl )
            // InternalMyDsl.g:1179:2: rule__Joint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__8__Impl();

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
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalMyDsl.g:1185:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__TypeAssignment_8 ) ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ( rule__Joint__TypeAssignment_8 ) ) )
            // InternalMyDsl.g:1190:1: ( ( rule__Joint__TypeAssignment_8 ) )
            {
            // InternalMyDsl.g:1190:1: ( ( rule__Joint__TypeAssignment_8 ) )
            // InternalMyDsl.g:1191:2: ( rule__Joint__TypeAssignment_8 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_8()); 
            // InternalMyDsl.g:1192:2: ( rule__Joint__TypeAssignment_8 )
            // InternalMyDsl.g:1192:3: rule__Joint__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_8()); 

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
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group_2__0"
    // InternalMyDsl.g:1201:1: rule__Joint__Group_2__0 : rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1 ;
    public final void rule__Joint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1 )
            // InternalMyDsl.g:1206:2: rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2__1();

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
    // $ANTLR end "rule__Joint__Group_2__0"


    // $ANTLR start "rule__Joint__Group_2__0__Impl"
    // InternalMyDsl.g:1213:1: rule__Joint__Group_2__0__Impl : ( 'isReuseOf' ) ;
    public final void rule__Joint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( ( 'isReuseOf' ) )
            // InternalMyDsl.g:1218:1: ( 'isReuseOf' )
            {
            // InternalMyDsl.g:1218:1: ( 'isReuseOf' )
            // InternalMyDsl.g:1219:2: 'isReuseOf'
            {
             before(grammarAccess.getJointAccess().getIsReuseOfKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getIsReuseOfKeyword_2_0()); 

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
    // $ANTLR end "rule__Joint__Group_2__0__Impl"


    // $ANTLR start "rule__Joint__Group_2__1"
    // InternalMyDsl.g:1228:1: rule__Joint__Group_2__1 : rule__Joint__Group_2__1__Impl ;
    public final void rule__Joint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__Joint__Group_2__1__Impl )
            // InternalMyDsl.g:1233:2: rule__Joint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_2__1"


    // $ANTLR start "rule__Joint__Group_2__1__Impl"
    // InternalMyDsl.g:1239:1: rule__Joint__Group_2__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_2_1 ) ) ;
    public final void rule__Joint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( ( ( rule__Joint__IsReuseOfAssignment_2_1 ) ) )
            // InternalMyDsl.g:1244:1: ( ( rule__Joint__IsReuseOfAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1244:1: ( ( rule__Joint__IsReuseOfAssignment_2_1 ) )
            // InternalMyDsl.g:1245:2: ( rule__Joint__IsReuseOfAssignment_2_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1()); 
            // InternalMyDsl.g:1246:2: ( rule__Joint__IsReuseOfAssignment_2_1 )
            // InternalMyDsl.g:1246:3: rule__Joint__IsReuseOfAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__IsReuseOfAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1()); 

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
    // $ANTLR end "rule__Joint__Group_2__1__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalMyDsl.g:1255:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:1260:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

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
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalMyDsl.g:1267:1: rule__Inertia__Group__0__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:1272:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:1272:1: ( 'Inertia' )
            // InternalMyDsl.g:1273:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_0()); 

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
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalMyDsl.g:1282:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:1287:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

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
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalMyDsl.g:1294:1: rule__Inertia__Group__1__Impl : ( ( rule__Inertia__NameAssignment_1 )? ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( ( rule__Inertia__NameAssignment_1 )? ) )
            // InternalMyDsl.g:1299:1: ( ( rule__Inertia__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:1299:1: ( ( rule__Inertia__NameAssignment_1 )? )
            // InternalMyDsl.g:1300:2: ( rule__Inertia__NameAssignment_1 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1301:2: ( rule__Inertia__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1301:3: rule__Inertia__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalMyDsl.g:1309:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:1314:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

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
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalMyDsl.g:1321:1: rule__Inertia__Group__2__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:1326:1: ( 'ixx' )
            {
            // InternalMyDsl.g:1326:1: ( 'ixx' )
            // InternalMyDsl.g:1327:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 

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
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalMyDsl.g:1336:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:1341:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

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
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalMyDsl.g:1348:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__IxxAssignment_3 ) ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( ( rule__Inertia__IxxAssignment_3 ) ) )
            // InternalMyDsl.g:1353:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            {
            // InternalMyDsl.g:1353:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            // InternalMyDsl.g:1354:2: ( rule__Inertia__IxxAssignment_3 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 
            // InternalMyDsl.g:1355:2: ( rule__Inertia__IxxAssignment_3 )
            // InternalMyDsl.g:1355:3: rule__Inertia__IxxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 

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
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalMyDsl.g:1363:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:1368:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

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
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalMyDsl.g:1375:1: rule__Inertia__Group__4__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:1380:1: ( 'ixy' )
            {
            // InternalMyDsl.g:1380:1: ( 'ixy' )
            // InternalMyDsl.g:1381:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 

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
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalMyDsl.g:1390:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:1395:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

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
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalMyDsl.g:1402:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__IxyAssignment_5 ) ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( ( rule__Inertia__IxyAssignment_5 ) ) )
            // InternalMyDsl.g:1407:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            {
            // InternalMyDsl.g:1407:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            // InternalMyDsl.g:1408:2: ( rule__Inertia__IxyAssignment_5 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 
            // InternalMyDsl.g:1409:2: ( rule__Inertia__IxyAssignment_5 )
            // InternalMyDsl.g:1409:3: rule__Inertia__IxyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 

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
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalMyDsl.g:1417:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:1422:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

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
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalMyDsl.g:1429:1: rule__Inertia__Group__6__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:1434:1: ( 'ixz' )
            {
            // InternalMyDsl.g:1434:1: ( 'ixz' )
            // InternalMyDsl.g:1435:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 

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
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalMyDsl.g:1444:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:1449:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

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
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalMyDsl.g:1456:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__IxzAssignment_7 ) ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( ( rule__Inertia__IxzAssignment_7 ) ) )
            // InternalMyDsl.g:1461:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            {
            // InternalMyDsl.g:1461:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            // InternalMyDsl.g:1462:2: ( rule__Inertia__IxzAssignment_7 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 
            // InternalMyDsl.g:1463:2: ( rule__Inertia__IxzAssignment_7 )
            // InternalMyDsl.g:1463:3: rule__Inertia__IxzAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 

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
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalMyDsl.g:1471:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:1476:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

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
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalMyDsl.g:1483:1: rule__Inertia__Group__8__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:1488:1: ( 'iyy' )
            {
            // InternalMyDsl.g:1488:1: ( 'iyy' )
            // InternalMyDsl.g:1489:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 

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
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalMyDsl.g:1498:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:1503:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Inertia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__10();

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
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalMyDsl.g:1510:1: rule__Inertia__Group__9__Impl : ( ( rule__Inertia__IyyAssignment_9 ) ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__Inertia__IyyAssignment_9 ) ) )
            // InternalMyDsl.g:1515:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            // InternalMyDsl.g:1516:2: ( rule__Inertia__IyyAssignment_9 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 
            // InternalMyDsl.g:1517:2: ( rule__Inertia__IyyAssignment_9 )
            // InternalMyDsl.g:1517:3: rule__Inertia__IyyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 

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
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group__10"
    // InternalMyDsl.g:1525:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:1530:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__11();

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
    // $ANTLR end "rule__Inertia__Group__10"


    // $ANTLR start "rule__Inertia__Group__10__Impl"
    // InternalMyDsl.g:1537:1: rule__Inertia__Group__10__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:1542:1: ( 'iyz' )
            {
            // InternalMyDsl.g:1542:1: ( 'iyz' )
            // InternalMyDsl.g:1543:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 

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
    // $ANTLR end "rule__Inertia__Group__10__Impl"


    // $ANTLR start "rule__Inertia__Group__11"
    // InternalMyDsl.g:1552:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:1557:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__Inertia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12();

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
    // $ANTLR end "rule__Inertia__Group__11"


    // $ANTLR start "rule__Inertia__Group__11__Impl"
    // InternalMyDsl.g:1564:1: rule__Inertia__Group__11__Impl : ( ( rule__Inertia__IyzAssignment_11 ) ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ( rule__Inertia__IyzAssignment_11 ) ) )
            // InternalMyDsl.g:1569:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            {
            // InternalMyDsl.g:1569:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            // InternalMyDsl.g:1570:2: ( rule__Inertia__IyzAssignment_11 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 
            // InternalMyDsl.g:1571:2: ( rule__Inertia__IyzAssignment_11 )
            // InternalMyDsl.g:1571:3: rule__Inertia__IyzAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 

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
    // $ANTLR end "rule__Inertia__Group__11__Impl"


    // $ANTLR start "rule__Inertia__Group__12"
    // InternalMyDsl.g:1579:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:1584:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13();

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
    // $ANTLR end "rule__Inertia__Group__12"


    // $ANTLR start "rule__Inertia__Group__12__Impl"
    // InternalMyDsl.g:1591:1: rule__Inertia__Group__12__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( 'izz' ) )
            // InternalMyDsl.g:1596:1: ( 'izz' )
            {
            // InternalMyDsl.g:1596:1: ( 'izz' )
            // InternalMyDsl.g:1597:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 

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
    // $ANTLR end "rule__Inertia__Group__12__Impl"


    // $ANTLR start "rule__Inertia__Group__13"
    // InternalMyDsl.g:1606:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__Inertia__Group__13__Impl )
            // InternalMyDsl.g:1611:2: rule__Inertia__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13__Impl();

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
    // $ANTLR end "rule__Inertia__Group__13"


    // $ANTLR start "rule__Inertia__Group__13__Impl"
    // InternalMyDsl.g:1617:1: rule__Inertia__Group__13__Impl : ( ( rule__Inertia__IzzAssignment_13 ) ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( ( rule__Inertia__IzzAssignment_13 ) ) )
            // InternalMyDsl.g:1622:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            {
            // InternalMyDsl.g:1622:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            // InternalMyDsl.g:1623:2: ( rule__Inertia__IzzAssignment_13 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 
            // InternalMyDsl.g:1624:2: ( rule__Inertia__IzzAssignment_13 )
            // InternalMyDsl.g:1624:3: rule__Inertia__IzzAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 

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
    // $ANTLR end "rule__Inertia__Group__13__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalMyDsl.g:1633:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:1638:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

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
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalMyDsl.g:1645:1: rule__Origin__Group__0__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:1650:1: ( 'Origin' )
            {
            // InternalMyDsl.g:1650:1: ( 'Origin' )
            // InternalMyDsl.g:1651:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

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
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalMyDsl.g:1660:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:1665:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

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
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalMyDsl.g:1672:1: rule__Origin__Group__1__Impl : ( ( rule__Origin__NameAssignment_1 )? ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( ( ( rule__Origin__NameAssignment_1 )? ) )
            // InternalMyDsl.g:1677:1: ( ( rule__Origin__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:1677:1: ( ( rule__Origin__NameAssignment_1 )? )
            // InternalMyDsl.g:1678:2: ( rule__Origin__NameAssignment_1 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1679:2: ( rule__Origin__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1679:3: rule__Origin__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalMyDsl.g:1687:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:1692:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

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
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalMyDsl.g:1699:1: rule__Origin__Group__2__Impl : ( 'xyz' ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( 'xyz' ) )
            // InternalMyDsl.g:1704:1: ( 'xyz' )
            {
            // InternalMyDsl.g:1704:1: ( 'xyz' )
            // InternalMyDsl.g:1705:2: 'xyz'
            {
             before(grammarAccess.getOriginAccess().getXyzKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXyzKeyword_2()); 

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
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalMyDsl.g:1714:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:1719:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

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
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalMyDsl.g:1726:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__XAssignment_3 ) ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( ( rule__Origin__XAssignment_3 ) ) )
            // InternalMyDsl.g:1731:1: ( ( rule__Origin__XAssignment_3 ) )
            {
            // InternalMyDsl.g:1731:1: ( ( rule__Origin__XAssignment_3 ) )
            // InternalMyDsl.g:1732:2: ( rule__Origin__XAssignment_3 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_3()); 
            // InternalMyDsl.g:1733:2: ( rule__Origin__XAssignment_3 )
            // InternalMyDsl.g:1733:3: rule__Origin__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_3()); 

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
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalMyDsl.g:1741:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:1746:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

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
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalMyDsl.g:1753:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__YAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( ( rule__Origin__YAssignment_4 ) ) )
            // InternalMyDsl.g:1758:1: ( ( rule__Origin__YAssignment_4 ) )
            {
            // InternalMyDsl.g:1758:1: ( ( rule__Origin__YAssignment_4 ) )
            // InternalMyDsl.g:1759:2: ( rule__Origin__YAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_4()); 
            // InternalMyDsl.g:1760:2: ( rule__Origin__YAssignment_4 )
            // InternalMyDsl.g:1760:3: rule__Origin__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_4()); 

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
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalMyDsl.g:1768:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:1773:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

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
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalMyDsl.g:1780:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__ZAssignment_5 ) ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( ( rule__Origin__ZAssignment_5 ) ) )
            // InternalMyDsl.g:1785:1: ( ( rule__Origin__ZAssignment_5 ) )
            {
            // InternalMyDsl.g:1785:1: ( ( rule__Origin__ZAssignment_5 ) )
            // InternalMyDsl.g:1786:2: ( rule__Origin__ZAssignment_5 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_5()); 
            // InternalMyDsl.g:1787:2: ( rule__Origin__ZAssignment_5 )
            // InternalMyDsl.g:1787:3: rule__Origin__ZAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_5()); 

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
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalMyDsl.g:1795:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__Origin__Group__6__Impl )
            // InternalMyDsl.g:1800:2: rule__Origin__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__6__Impl();

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
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalMyDsl.g:1806:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__Group_6__0 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( ( rule__Origin__Group_6__0 )? ) )
            // InternalMyDsl.g:1811:1: ( ( rule__Origin__Group_6__0 )? )
            {
            // InternalMyDsl.g:1811:1: ( ( rule__Origin__Group_6__0 )? )
            // InternalMyDsl.g:1812:2: ( rule__Origin__Group_6__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_6()); 
            // InternalMyDsl.g:1813:2: ( rule__Origin__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1813:3: rule__Origin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group_6__0"
    // InternalMyDsl.g:1822:1: rule__Origin__Group_6__0 : rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 ;
    public final void rule__Origin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 )
            // InternalMyDsl.g:1827:2: rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__1();

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
    // $ANTLR end "rule__Origin__Group_6__0"


    // $ANTLR start "rule__Origin__Group_6__0__Impl"
    // InternalMyDsl.g:1834:1: rule__Origin__Group_6__0__Impl : ( 'roll_pitch_yaw' ) ;
    public final void rule__Origin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( 'roll_pitch_yaw' ) )
            // InternalMyDsl.g:1839:1: ( 'roll_pitch_yaw' )
            {
            // InternalMyDsl.g:1839:1: ( 'roll_pitch_yaw' )
            // InternalMyDsl.g:1840:2: 'roll_pitch_yaw'
            {
             before(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 

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
    // $ANTLR end "rule__Origin__Group_6__0__Impl"


    // $ANTLR start "rule__Origin__Group_6__1"
    // InternalMyDsl.g:1849:1: rule__Origin__Group_6__1 : rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 ;
    public final void rule__Origin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 )
            // InternalMyDsl.g:1854:2: rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__2();

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
    // $ANTLR end "rule__Origin__Group_6__1"


    // $ANTLR start "rule__Origin__Group_6__1__Impl"
    // InternalMyDsl.g:1861:1: rule__Origin__Group_6__1__Impl : ( ( rule__Origin__RollAssignment_6_1 ) ) ;
    public final void rule__Origin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( ( ( rule__Origin__RollAssignment_6_1 ) ) )
            // InternalMyDsl.g:1866:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1866:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            // InternalMyDsl.g:1867:2: ( rule__Origin__RollAssignment_6_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 
            // InternalMyDsl.g:1868:2: ( rule__Origin__RollAssignment_6_1 )
            // InternalMyDsl.g:1868:3: rule__Origin__RollAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 

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
    // $ANTLR end "rule__Origin__Group_6__1__Impl"


    // $ANTLR start "rule__Origin__Group_6__2"
    // InternalMyDsl.g:1876:1: rule__Origin__Group_6__2 : rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 ;
    public final void rule__Origin__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 )
            // InternalMyDsl.g:1881:2: rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3();

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
    // $ANTLR end "rule__Origin__Group_6__2"


    // $ANTLR start "rule__Origin__Group_6__2__Impl"
    // InternalMyDsl.g:1888:1: rule__Origin__Group_6__2__Impl : ( ( rule__Origin__PitchAssignment_6_2 ) ) ;
    public final void rule__Origin__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( ( rule__Origin__PitchAssignment_6_2 ) ) )
            // InternalMyDsl.g:1893:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1893:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            // InternalMyDsl.g:1894:2: ( rule__Origin__PitchAssignment_6_2 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 
            // InternalMyDsl.g:1895:2: ( rule__Origin__PitchAssignment_6_2 )
            // InternalMyDsl.g:1895:3: rule__Origin__PitchAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 

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
    // $ANTLR end "rule__Origin__Group_6__2__Impl"


    // $ANTLR start "rule__Origin__Group_6__3"
    // InternalMyDsl.g:1903:1: rule__Origin__Group_6__3 : rule__Origin__Group_6__3__Impl ;
    public final void rule__Origin__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__Origin__Group_6__3__Impl )
            // InternalMyDsl.g:1908:2: rule__Origin__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3__Impl();

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
    // $ANTLR end "rule__Origin__Group_6__3"


    // $ANTLR start "rule__Origin__Group_6__3__Impl"
    // InternalMyDsl.g:1914:1: rule__Origin__Group_6__3__Impl : ( ( rule__Origin__YawAssignment_6_3 ) ) ;
    public final void rule__Origin__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( ( rule__Origin__YawAssignment_6_3 ) ) )
            // InternalMyDsl.g:1919:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            {
            // InternalMyDsl.g:1919:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            // InternalMyDsl.g:1920:2: ( rule__Origin__YawAssignment_6_3 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 
            // InternalMyDsl.g:1921:2: ( rule__Origin__YawAssignment_6_3 )
            // InternalMyDsl.g:1921:3: rule__Origin__YawAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 

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
    // $ANTLR end "rule__Origin__Group_6__3__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalMyDsl.g:1930:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:1935:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

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
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalMyDsl.g:1942:1: rule__Mass__Group__0__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:1947:1: ( 'Mass' )
            {
            // InternalMyDsl.g:1947:1: ( 'Mass' )
            // InternalMyDsl.g:1948:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_0()); 

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
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalMyDsl.g:1957:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:1962:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

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
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalMyDsl.g:1969:1: rule__Mass__Group__1__Impl : ( ( rule__Mass__NameAssignment_1 )? ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ( rule__Mass__NameAssignment_1 )? ) )
            // InternalMyDsl.g:1974:1: ( ( rule__Mass__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:1974:1: ( ( rule__Mass__NameAssignment_1 )? )
            // InternalMyDsl.g:1975:2: ( rule__Mass__NameAssignment_1 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1976:2: ( rule__Mass__NameAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1976:3: rule__Mass__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalMyDsl.g:1984:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:1989:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

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
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalMyDsl.g:1996:1: rule__Mass__Group__2__Impl : ( 'massValueInKilograms' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( 'massValueInKilograms' ) )
            // InternalMyDsl.g:2001:1: ( 'massValueInKilograms' )
            {
            // InternalMyDsl.g:2001:1: ( 'massValueInKilograms' )
            // InternalMyDsl.g:2002:2: 'massValueInKilograms'
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 

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
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalMyDsl.g:2011:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( rule__Mass__Group__3__Impl )
            // InternalMyDsl.g:2016:2: rule__Mass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__3__Impl();

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
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalMyDsl.g:2022:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) )
            // InternalMyDsl.g:2027:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            {
            // InternalMyDsl.g:2027:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            // InternalMyDsl.g:2028:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 
            // InternalMyDsl.g:2029:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            // InternalMyDsl.g:2029:3: rule__Mass__MassValueInKilogramsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mass__MassValueInKilogramsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 

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
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalMyDsl.g:2038:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2043:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2043:2: ( RULE_ID )
            // InternalMyDsl.g:2044:3: RULE_ID
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
    // InternalMyDsl.g:2053:1: rule__Robot__TopologiesAssignment_3 : ( ruleTopology ) ;
    public final void rule__Robot__TopologiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:2058:2: ( ruleTopology )
            {
            // InternalMyDsl.g:2058:2: ( ruleTopology )
            // InternalMyDsl.g:2059:3: ruleTopology
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
    // InternalMyDsl.g:2068:1: rule__Robot__LinkAssignment_4_0 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( ( ruleLink ) )
            // InternalMyDsl.g:2073:2: ( ruleLink )
            {
            // InternalMyDsl.g:2073:2: ( ruleLink )
            // InternalMyDsl.g:2074:3: ruleLink
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
    // InternalMyDsl.g:2083:1: rule__Robot__JointAssignment_4_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:2088:2: ( ruleJoint )
            {
            // InternalMyDsl.g:2088:2: ( ruleJoint )
            // InternalMyDsl.g:2089:3: ruleJoint
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


    // $ANTLR start "rule__Robot__LinkrefsAssignment_4_2"
    // InternalMyDsl.g:2098:1: rule__Robot__LinkrefsAssignment_4_2 : ( ruleLinkRef ) ;
    public final void rule__Robot__LinkrefsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( ( ruleLinkRef ) )
            // InternalMyDsl.g:2103:2: ( ruleLinkRef )
            {
            // InternalMyDsl.g:2103:2: ( ruleLinkRef )
            // InternalMyDsl.g:2104:3: ruleLinkRef
            {
             before(grammarAccess.getRobotAccess().getLinkrefsLinkRefParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkRef();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkrefsLinkRefParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Robot__LinkrefsAssignment_4_2"


    // $ANTLR start "rule__Topology__ParentAssignment_0"
    // InternalMyDsl.g:2113:1: rule__Topology__ParentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Topology__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2118:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2118:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2119:3: ( RULE_ID )
            {
             before(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 
            // InternalMyDsl.g:2120:3: ( RULE_ID )
            // InternalMyDsl.g:2121:4: RULE_ID
            {
             before(grammarAccess.getTopologyAccess().getParentLinkIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopologyAccess().getParentLinkIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 

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
    // InternalMyDsl.g:2132:1: rule__Topology__JointAssignment_1_0 : ( ruleJointRef ) ;
    public final void rule__Topology__JointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( ruleJointRef ) )
            // InternalMyDsl.g:2137:2: ( ruleJointRef )
            {
            // InternalMyDsl.g:2137:2: ( ruleJointRef )
            // InternalMyDsl.g:2138:3: ruleJointRef
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
    // InternalMyDsl.g:2147:1: rule__Topology__ChildAssignment_1_1 : ( ruleTopology ) ;
    public final void rule__Topology__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:2152:2: ( ruleTopology )
            {
            // InternalMyDsl.g:2152:2: ( ruleTopology )
            // InternalMyDsl.g:2153:3: ruleTopology
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
    // InternalMyDsl.g:2162:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2167:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2167:2: ( RULE_ID )
            // InternalMyDsl.g:2168:3: RULE_ID
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


    // $ANTLR start "rule__Link__IsReuseOfAssignment_2_1"
    // InternalMyDsl.g:2177:1: rule__Link__IsReuseOfAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__IsReuseOfAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2182:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2182:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2183:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_2_1_0()); 
            // InternalMyDsl.g:2184:3: ( RULE_ID )
            // InternalMyDsl.g:2185:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfLinkIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getIsReuseOfLinkIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Link__IsReuseOfAssignment_2_1"


    // $ANTLR start "rule__Link__DecoratorAssignment_3"
    // InternalMyDsl.g:2196:1: rule__Link__DecoratorAssignment_3 : ( ruleLinkDecorator ) ;
    public final void rule__Link__DecoratorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( ruleLinkDecorator ) )
            // InternalMyDsl.g:2201:2: ( ruleLinkDecorator )
            {
            // InternalMyDsl.g:2201:2: ( ruleLinkDecorator )
            // InternalMyDsl.g:2202:3: ruleLinkDecorator
            {
             before(grammarAccess.getLinkAccess().getDecoratorLinkDecoratorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkDecorator();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getDecoratorLinkDecoratorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Link__DecoratorAssignment_3"


    // $ANTLR start "rule__LinkDecorator__InertAssignment_1"
    // InternalMyDsl.g:2211:1: rule__LinkDecorator__InertAssignment_1 : ( ruleInertia ) ;
    public final void rule__LinkDecorator__InertAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:2216:2: ( ruleInertia )
            {
            // InternalMyDsl.g:2216:2: ( ruleInertia )
            // InternalMyDsl.g:2217:3: ruleInertia
            {
             before(grammarAccess.getLinkDecoratorAccess().getInertInertiaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getLinkDecoratorAccess().getInertInertiaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LinkDecorator__InertAssignment_1"


    // $ANTLR start "rule__LinkRef__RefAssignment_1"
    // InternalMyDsl.g:2226:1: rule__LinkRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LinkRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2231:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2231:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2232:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_1_0()); 
            // InternalMyDsl.g:2233:3: ( RULE_ID )
            // InternalMyDsl.g:2234:4: RULE_ID
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getRefLinkIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_1_0()); 

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
    // $ANTLR end "rule__LinkRef__RefAssignment_1"


    // $ANTLR start "rule__LinkRef__DecoratorAssignment_2"
    // InternalMyDsl.g:2245:1: rule__LinkRef__DecoratorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LinkRef__DecoratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2250:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2250:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2251:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorCrossReference_2_0()); 
            // InternalMyDsl.g:2252:3: ( RULE_ID )
            // InternalMyDsl.g:2253:4: RULE_ID
            {
             before(grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorCrossReference_2_0()); 

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
    // $ANTLR end "rule__LinkRef__DecoratorAssignment_2"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalMyDsl.g:2264:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2269:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2269:2: ( RULE_ID )
            // InternalMyDsl.g:2270:3: RULE_ID
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


    // $ANTLR start "rule__Joint__IsReuseOfAssignment_2_1"
    // InternalMyDsl.g:2279:1: rule__Joint__IsReuseOfAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2284:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2284:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2285:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_0()); 
            // InternalMyDsl.g:2286:3: ( RULE_ID )
            // InternalMyDsl.g:2287:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Joint__IsReuseOfAssignment_2_1"


    // $ANTLR start "rule__Joint__ChildOfAssignment_4"
    // InternalMyDsl.g:2298:1: rule__Joint__ChildOfAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2303:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2303:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2304:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0()); 
            // InternalMyDsl.g:2305:3: ( RULE_ID )
            // InternalMyDsl.g:2306:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0()); 

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
    // $ANTLR end "rule__Joint__ChildOfAssignment_4"


    // $ANTLR start "rule__Joint__ParentOfAssignment_6"
    // InternalMyDsl.g:2317:1: rule__Joint__ParentOfAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2321:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2322:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2322:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2323:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0()); 
            // InternalMyDsl.g:2324:3: ( RULE_ID )
            // InternalMyDsl.g:2325:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0()); 

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
    // $ANTLR end "rule__Joint__ParentOfAssignment_6"


    // $ANTLR start "rule__Joint__TypeAssignment_8"
    // InternalMyDsl.g:2336:1: rule__Joint__TypeAssignment_8 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:2341:2: ( ruleJointType )
            {
            // InternalMyDsl.g:2341:2: ( ruleJointType )
            // InternalMyDsl.g:2342:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Joint__TypeAssignment_8"


    // $ANTLR start "rule__JointRef__FixAssignment_0"
    // InternalMyDsl.g:2351:1: rule__JointRef__FixAssignment_0 : ( ( '->' ) ) ;
    public final void rule__JointRef__FixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2355:1: ( ( ( '->' ) ) )
            // InternalMyDsl.g:2356:2: ( ( '->' ) )
            {
            // InternalMyDsl.g:2356:2: ( ( '->' ) )
            // InternalMyDsl.g:2357:3: ( '->' )
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            // InternalMyDsl.g:2358:3: ( '->' )
            // InternalMyDsl.g:2359:4: '->'
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2370:1: rule__JointRef__RevAssignment_1 : ( ( 'r->' ) ) ;
    public final void rule__JointRef__RevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( ( ( 'r->' ) ) )
            // InternalMyDsl.g:2375:2: ( ( 'r->' ) )
            {
            // InternalMyDsl.g:2375:2: ( ( 'r->' ) )
            // InternalMyDsl.g:2376:3: ( 'r->' )
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            // InternalMyDsl.g:2377:3: ( 'r->' )
            // InternalMyDsl.g:2378:4: 'r->'
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2389:1: rule__JointRef__PrisAssignment_2 : ( ( 'p->' ) ) ;
    public final void rule__JointRef__PrisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ( 'p->' ) ) )
            // InternalMyDsl.g:2394:2: ( ( 'p->' ) )
            {
            // InternalMyDsl.g:2394:2: ( ( 'p->' ) )
            // InternalMyDsl.g:2395:3: ( 'p->' )
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            // InternalMyDsl.g:2396:3: ( 'p->' )
            // InternalMyDsl.g:2397:4: 'p->'
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2408:1: rule__JointRef__ContAssignment_3 : ( ( 'c->' ) ) ;
    public final void rule__JointRef__ContAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( ( 'c->' ) ) )
            // InternalMyDsl.g:2413:2: ( ( 'c->' ) )
            {
            // InternalMyDsl.g:2413:2: ( ( 'c->' ) )
            // InternalMyDsl.g:2414:3: ( 'c->' )
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            // InternalMyDsl.g:2415:3: ( 'c->' )
            // InternalMyDsl.g:2416:4: 'c->'
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__Inertia__NameAssignment_1"
    // InternalMyDsl.g:2427:1: rule__Inertia__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2432:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2432:2: ( RULE_ID )
            // InternalMyDsl.g:2433:3: RULE_ID
            {
             before(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Inertia__NameAssignment_1"


    // $ANTLR start "rule__Inertia__IxxAssignment_3"
    // InternalMyDsl.g:2442:1: rule__Inertia__IxxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Inertia__IxxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2447:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2447:2: ( RULE_INT )
            // InternalMyDsl.g:2448:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIxxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Inertia__IxxAssignment_3"


    // $ANTLR start "rule__Inertia__IxyAssignment_5"
    // InternalMyDsl.g:2457:1: rule__Inertia__IxyAssignment_5 : ( RULE_INT ) ;
    public final void rule__Inertia__IxyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2462:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2462:2: ( RULE_INT )
            // InternalMyDsl.g:2463:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIxyINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Inertia__IxyAssignment_5"


    // $ANTLR start "rule__Inertia__IxzAssignment_7"
    // InternalMyDsl.g:2472:1: rule__Inertia__IxzAssignment_7 : ( RULE_INT ) ;
    public final void rule__Inertia__IxzAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2477:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2477:2: ( RULE_INT )
            // InternalMyDsl.g:2478:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIxzINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Inertia__IxzAssignment_7"


    // $ANTLR start "rule__Inertia__IyyAssignment_9"
    // InternalMyDsl.g:2487:1: rule__Inertia__IyyAssignment_9 : ( RULE_INT ) ;
    public final void rule__Inertia__IyyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2492:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2492:2: ( RULE_INT )
            // InternalMyDsl.g:2493:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIyyINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Inertia__IyyAssignment_9"


    // $ANTLR start "rule__Inertia__IyzAssignment_11"
    // InternalMyDsl.g:2502:1: rule__Inertia__IyzAssignment_11 : ( RULE_INT ) ;
    public final void rule__Inertia__IyzAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2507:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2507:2: ( RULE_INT )
            // InternalMyDsl.g:2508:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIyzINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Inertia__IyzAssignment_11"


    // $ANTLR start "rule__Inertia__IzzAssignment_13"
    // InternalMyDsl.g:2517:1: rule__Inertia__IzzAssignment_13 : ( RULE_INT ) ;
    public final void rule__Inertia__IzzAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2522:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2522:2: ( RULE_INT )
            // InternalMyDsl.g:2523:3: RULE_INT
            {
             before(grammarAccess.getInertiaAccess().getIzzINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzINTTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Inertia__IzzAssignment_13"


    // $ANTLR start "rule__Origin__NameAssignment_1"
    // InternalMyDsl.g:2532:1: rule__Origin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2537:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2537:2: ( RULE_ID )
            // InternalMyDsl.g:2538:3: RULE_ID
            {
             before(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Origin__NameAssignment_1"


    // $ANTLR start "rule__Origin__XAssignment_3"
    // InternalMyDsl.g:2547:1: rule__Origin__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__Origin__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2552:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2552:2: ( RULE_INT )
            // InternalMyDsl.g:2553:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Origin__XAssignment_3"


    // $ANTLR start "rule__Origin__YAssignment_4"
    // InternalMyDsl.g:2562:1: rule__Origin__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Origin__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2567:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2567:2: ( RULE_INT )
            // InternalMyDsl.g:2568:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Origin__YAssignment_4"


    // $ANTLR start "rule__Origin__ZAssignment_5"
    // InternalMyDsl.g:2577:1: rule__Origin__ZAssignment_5 : ( RULE_INT ) ;
    public final void rule__Origin__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2582:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2582:2: ( RULE_INT )
            // InternalMyDsl.g:2583:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getZINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getZINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Origin__ZAssignment_5"


    // $ANTLR start "rule__Origin__RollAssignment_6_1"
    // InternalMyDsl.g:2592:1: rule__Origin__RollAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Origin__RollAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2597:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2597:2: ( RULE_INT )
            // InternalMyDsl.g:2598:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Origin__RollAssignment_6_1"


    // $ANTLR start "rule__Origin__PitchAssignment_6_2"
    // InternalMyDsl.g:2607:1: rule__Origin__PitchAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Origin__PitchAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2612:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2612:2: ( RULE_INT )
            // InternalMyDsl.g:2613:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Origin__PitchAssignment_6_2"


    // $ANTLR start "rule__Origin__YawAssignment_6_3"
    // InternalMyDsl.g:2622:1: rule__Origin__YawAssignment_6_3 : ( RULE_INT ) ;
    public final void rule__Origin__YawAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2627:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2627:2: ( RULE_INT )
            // InternalMyDsl.g:2628:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Origin__YawAssignment_6_3"


    // $ANTLR start "rule__Mass__NameAssignment_1"
    // InternalMyDsl.g:2637:1: rule__Mass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2642:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2642:2: ( RULE_ID )
            // InternalMyDsl.g:2643:3: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mass__NameAssignment_1"


    // $ANTLR start "rule__Mass__MassValueInKilogramsAssignment_3"
    // InternalMyDsl.g:2652:1: rule__Mass__MassValueInKilogramsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Mass__MassValueInKilogramsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2657:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2657:2: ( RULE_INT )
            // InternalMyDsl.g:2658:3: RULE_INT
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassValueInKilogramsINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mass__MassValueInKilogramsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001A0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000010L});

}