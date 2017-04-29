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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'entity'", "'{'", "'}'", "'attr'", "':'", "'ref'", "'use'", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDot.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalMyDot.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDot.g:54:1: ( ruleModel EOF )
            // InternalMyDot.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDot.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDot.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDot.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDot.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDot.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDot.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDot.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDot.g:79:1: ( ruleEntity EOF )
            // InternalMyDot.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDot.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDot.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDot.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDot.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDot.g:94:3: ( rule__Entity__Group__0 )
            // InternalMyDot.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalMyDot.g:103:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyDot.g:104:1: ( ruleFeature EOF )
            // InternalMyDot.g:105:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyDot.g:112:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:116:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalMyDot.g:117:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalMyDot.g:117:2: ( ( rule__Feature__Alternatives ) )
            // InternalMyDot.g:118:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalMyDot.g:119:3: ( rule__Feature__Alternatives )
            // InternalMyDot.g:119:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDot.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDot.g:129:1: ( ruleAttribute EOF )
            // InternalMyDot.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDot.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDot.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDot.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDot.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDot.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMyDot.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalMyDot.g:153:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMyDot.g:154:1: ( ruleReference EOF )
            // InternalMyDot.g:155:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMyDot.g:162:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:166:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalMyDot.g:167:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalMyDot.g:167:2: ( ( rule__Reference__Group__0 ) )
            // InternalMyDot.g:168:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalMyDot.g:169:3: ( rule__Reference__Group__0 )
            // InternalMyDot.g:169:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleUsage"
    // InternalMyDot.g:178:1: entryRuleUsage : ruleUsage EOF ;
    public final void entryRuleUsage() throws RecognitionException {
        try {
            // InternalMyDot.g:179:1: ( ruleUsage EOF )
            // InternalMyDot.g:180:1: ruleUsage EOF
            {
             before(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_1);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getUsageRule()); 
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
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // InternalMyDot.g:187:1: ruleUsage : ( ( rule__Usage__Group__0 ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:191:2: ( ( ( rule__Usage__Group__0 ) ) )
            // InternalMyDot.g:192:2: ( ( rule__Usage__Group__0 ) )
            {
            // InternalMyDot.g:192:2: ( ( rule__Usage__Group__0 ) )
            // InternalMyDot.g:193:3: ( rule__Usage__Group__0 )
            {
             before(grammarAccess.getUsageAccess().getGroup()); 
            // InternalMyDot.g:194:3: ( rule__Usage__Group__0 )
            // InternalMyDot.g:194:4: rule__Usage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Usage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsageAccess().getGroup()); 

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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDot.g:203:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyDot.g:204:1: ( ruleDotExpression EOF )
            // InternalMyDot.g:205:1: ruleDotExpression EOF
            {
             before(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getDotExpressionRule()); 
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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyDot.g:212:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:216:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyDot.g:217:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyDot.g:217:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyDot.g:218:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyDot.g:219:3: ( rule__DotExpression__Group__0 )
            // InternalMyDot.g:219:4: rule__DotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleEntityRef"
    // InternalMyDot.g:228:1: entryRuleEntityRef : ruleEntityRef EOF ;
    public final void entryRuleEntityRef() throws RecognitionException {
        try {
            // InternalMyDot.g:229:1: ( ruleEntityRef EOF )
            // InternalMyDot.g:230:1: ruleEntityRef EOF
            {
             before(grammarAccess.getEntityRefRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityRef();

            state._fsp--;

             after(grammarAccess.getEntityRefRule()); 
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
    // $ANTLR end "entryRuleEntityRef"


    // $ANTLR start "ruleEntityRef"
    // InternalMyDot.g:237:1: ruleEntityRef : ( ( rule__EntityRef__Group__0 ) ) ;
    public final void ruleEntityRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:241:2: ( ( ( rule__EntityRef__Group__0 ) ) )
            // InternalMyDot.g:242:2: ( ( rule__EntityRef__Group__0 ) )
            {
            // InternalMyDot.g:242:2: ( ( rule__EntityRef__Group__0 ) )
            // InternalMyDot.g:243:3: ( rule__EntityRef__Group__0 )
            {
             before(grammarAccess.getEntityRefAccess().getGroup()); 
            // InternalMyDot.g:244:3: ( rule__EntityRef__Group__0 )
            // InternalMyDot.g:244:4: rule__EntityRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityRefAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityRef"


    // $ANTLR start "ruleDataType"
    // InternalMyDot.g:253:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:257:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalMyDot.g:258:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalMyDot.g:258:2: ( ( rule__DataType__Alternatives ) )
            // InternalMyDot.g:259:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalMyDot.g:260:3: ( rule__DataType__Alternatives )
            // InternalMyDot.g:260:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalMyDot.g:268:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:272:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
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
                    // InternalMyDot.g:273:2: ( ruleAttribute )
                    {
                    // InternalMyDot.g:273:2: ( ruleAttribute )
                    // InternalMyDot.g:274:3: ruleAttribute
                    {
                     before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:279:2: ( ruleReference )
                    {
                    // InternalMyDot.g:279:2: ( ruleReference )
                    // InternalMyDot.g:280:3: ruleReference
                    {
                     before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalMyDot.g:289:1: rule__DataType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:293:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDot.g:294:2: ( ( 'string' ) )
                    {
                    // InternalMyDot.g:294:2: ( ( 'string' ) )
                    // InternalMyDot.g:295:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDot.g:296:3: ( 'string' )
                    // InternalMyDot.g:296:4: 'string'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:300:2: ( ( 'int' ) )
                    {
                    // InternalMyDot.g:300:2: ( ( 'int' ) )
                    // InternalMyDot.g:301:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDot.g:302:3: ( 'int' )
                    // InternalMyDot.g:302:4: 'int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDot.g:310:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:314:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDot.g:315:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDot.g:322:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntitiesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:326:1: ( ( ( rule__Model__EntitiesAssignment_0 )* ) )
            // InternalMyDot.g:327:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            {
            // InternalMyDot.g:327:1: ( ( rule__Model__EntitiesAssignment_0 )* )
            // InternalMyDot.g:328:2: ( rule__Model__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 
            // InternalMyDot.g:329:2: ( rule__Model__EntitiesAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDot.g:329:3: rule__Model__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDot.g:337:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:341:1: ( rule__Model__Group__1__Impl )
            // InternalMyDot.g:342:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDot.g:348:1: rule__Model__Group__1__Impl : ( ( rule__Model__UsagesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:352:1: ( ( ( rule__Model__UsagesAssignment_1 )* ) )
            // InternalMyDot.g:353:1: ( ( rule__Model__UsagesAssignment_1 )* )
            {
            // InternalMyDot.g:353:1: ( ( rule__Model__UsagesAssignment_1 )* )
            // InternalMyDot.g:354:2: ( rule__Model__UsagesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getUsagesAssignment_1()); 
            // InternalMyDot.g:355:2: ( rule__Model__UsagesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDot.g:355:3: rule__Model__UsagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__UsagesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsagesAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDot.g:364:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:368:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDot.g:369:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDot.g:376:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:380:1: ( ( 'entity' ) )
            // InternalMyDot.g:381:1: ( 'entity' )
            {
            // InternalMyDot.g:381:1: ( 'entity' )
            // InternalMyDot.g:382:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDot.g:391:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:395:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDot.g:396:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDot.g:403:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:407:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDot.g:408:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDot.g:408:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDot.g:409:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDot.g:410:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDot.g:410:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDot.g:418:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:422:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDot.g:423:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDot.g:430:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:434:1: ( ( '{' ) )
            // InternalMyDot.g:435:1: ( '{' )
            {
            // InternalMyDot.g:435:1: ( '{' )
            // InternalMyDot.g:436:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDot.g:445:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:449:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDot.g:450:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDot.g:457:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__FeaturesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:461:1: ( ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // InternalMyDot.g:462:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // InternalMyDot.g:462:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // InternalMyDot.g:463:2: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // InternalMyDot.g:464:2: ( rule__Entity__FeaturesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDot.g:464:3: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMyDot.g:472:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:476:1: ( rule__Entity__Group__4__Impl )
            // InternalMyDot.g:477:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMyDot.g:483:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:487:1: ( ( '}' ) )
            // InternalMyDot.g:488:1: ( '}' )
            {
            // InternalMyDot.g:488:1: ( '}' )
            // InternalMyDot.g:489:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDot.g:499:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:503:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDot.g:504:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDot.g:511:1: rule__Attribute__Group__0__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:515:1: ( ( 'attr' ) )
            // InternalMyDot.g:516:1: ( 'attr' )
            {
            // InternalMyDot.g:516:1: ( 'attr' )
            // InternalMyDot.g:517:2: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDot.g:526:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:530:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDot.g:531:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDot.g:538:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:542:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDot.g:543:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDot.g:543:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDot.g:544:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDot.g:545:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDot.g:545:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDot.g:553:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:557:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDot.g:558:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDot.g:565:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:569:1: ( ( ':' ) )
            // InternalMyDot.g:570:1: ( ':' )
            {
            // InternalMyDot.g:570:1: ( ':' )
            // InternalMyDot.g:571:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDot.g:580:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:584:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDot.g:585:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDot.g:591:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:595:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDot.g:596:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDot.g:596:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDot.g:597:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDot.g:598:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDot.g:598:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalMyDot.g:607:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:611:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalMyDot.g:612:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalMyDot.g:619:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:623:1: ( ( 'ref' ) )
            // InternalMyDot.g:624:1: ( 'ref' )
            {
            // InternalMyDot.g:624:1: ( 'ref' )
            // InternalMyDot.g:625:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalMyDot.g:634:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:638:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalMyDot.g:639:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalMyDot.g:646:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:650:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalMyDot.g:651:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalMyDot.g:651:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalMyDot.g:652:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalMyDot.g:653:2: ( rule__Reference__NameAssignment_1 )
            // InternalMyDot.g:653:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalMyDot.g:661:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:665:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalMyDot.g:666:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalMyDot.g:673:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:677:1: ( ( ':' ) )
            // InternalMyDot.g:678:1: ( ':' )
            {
            // InternalMyDot.g:678:1: ( ':' )
            // InternalMyDot.g:679:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalMyDot.g:688:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:692:1: ( rule__Reference__Group__3__Impl )
            // InternalMyDot.g:693:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalMyDot.g:699:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:703:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // InternalMyDot.g:704:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // InternalMyDot.g:704:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // InternalMyDot.g:705:2: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // InternalMyDot.g:706:2: ( rule__Reference__TypeAssignment_3 )
            // InternalMyDot.g:706:3: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Usage__Group__0"
    // InternalMyDot.g:715:1: rule__Usage__Group__0 : rule__Usage__Group__0__Impl rule__Usage__Group__1 ;
    public final void rule__Usage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:719:1: ( rule__Usage__Group__0__Impl rule__Usage__Group__1 )
            // InternalMyDot.g:720:2: rule__Usage__Group__0__Impl rule__Usage__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Usage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Usage__Group__1();

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
    // $ANTLR end "rule__Usage__Group__0"


    // $ANTLR start "rule__Usage__Group__0__Impl"
    // InternalMyDot.g:727:1: rule__Usage__Group__0__Impl : ( 'use' ) ;
    public final void rule__Usage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:731:1: ( ( 'use' ) )
            // InternalMyDot.g:732:1: ( 'use' )
            {
            // InternalMyDot.g:732:1: ( 'use' )
            // InternalMyDot.g:733:2: 'use'
            {
             before(grammarAccess.getUsageAccess().getUseKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUsageAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__Usage__Group__0__Impl"


    // $ANTLR start "rule__Usage__Group__1"
    // InternalMyDot.g:742:1: rule__Usage__Group__1 : rule__Usage__Group__1__Impl ;
    public final void rule__Usage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:746:1: ( rule__Usage__Group__1__Impl )
            // InternalMyDot.g:747:2: rule__Usage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Usage__Group__1__Impl();

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
    // $ANTLR end "rule__Usage__Group__1"


    // $ANTLR start "rule__Usage__Group__1__Impl"
    // InternalMyDot.g:753:1: rule__Usage__Group__1__Impl : ( ( rule__Usage__RefAssignment_1 ) ) ;
    public final void rule__Usage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:757:1: ( ( ( rule__Usage__RefAssignment_1 ) ) )
            // InternalMyDot.g:758:1: ( ( rule__Usage__RefAssignment_1 ) )
            {
            // InternalMyDot.g:758:1: ( ( rule__Usage__RefAssignment_1 ) )
            // InternalMyDot.g:759:2: ( rule__Usage__RefAssignment_1 )
            {
             before(grammarAccess.getUsageAccess().getRefAssignment_1()); 
            // InternalMyDot.g:760:2: ( rule__Usage__RefAssignment_1 )
            // InternalMyDot.g:760:3: rule__Usage__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Usage__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsageAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__Usage__Group__1__Impl"


    // $ANTLR start "rule__DotExpression__Group__0"
    // InternalMyDot.g:769:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:773:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDot.g:774:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DotExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1();

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
    // $ANTLR end "rule__DotExpression__Group__0"


    // $ANTLR start "rule__DotExpression__Group__0__Impl"
    // InternalMyDot.g:781:1: rule__DotExpression__Group__0__Impl : ( ruleEntityRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:785:1: ( ( ruleEntityRef ) )
            // InternalMyDot.g:786:1: ( ruleEntityRef )
            {
            // InternalMyDot.g:786:1: ( ruleEntityRef )
            // InternalMyDot.g:787:2: ruleEntityRef
            {
             before(grammarAccess.getDotExpressionAccess().getEntityRefParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityRef();

            state._fsp--;

             after(grammarAccess.getDotExpressionAccess().getEntityRefParserRuleCall_0()); 

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
    // $ANTLR end "rule__DotExpression__Group__0__Impl"


    // $ANTLR start "rule__DotExpression__Group__1"
    // InternalMyDot.g:796:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:800:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDot.g:801:2: rule__DotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__DotExpression__Group__1"


    // $ANTLR start "rule__DotExpression__Group__1__Impl"
    // InternalMyDot.g:807:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:811:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDot.g:812:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDot.g:812:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDot.g:813:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDot.g:814:2: ( rule__DotExpression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDot.g:814:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDotExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DotExpression__Group__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__0"
    // InternalMyDot.g:823:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:827:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDot.g:828:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__DotExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__1();

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
    // $ANTLR end "rule__DotExpression__Group_1__0"


    // $ANTLR start "rule__DotExpression__Group_1__0__Impl"
    // InternalMyDot.g:835:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:839:1: ( ( () ) )
            // InternalMyDot.g:840:1: ( () )
            {
            // InternalMyDot.g:840:1: ( () )
            // InternalMyDot.g:841:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDot.g:842:2: ()
            // InternalMyDot.g:842:3: 
            {
            }

             after(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__1"
    // InternalMyDot.g:850:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:854:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDot.g:855:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__DotExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2();

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
    // $ANTLR end "rule__DotExpression__Group_1__1"


    // $ANTLR start "rule__DotExpression__Group_1__1__Impl"
    // InternalMyDot.g:862:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:866:1: ( ( '.' ) )
            // InternalMyDot.g:867:1: ( '.' )
            {
            // InternalMyDot.g:867:1: ( '.' )
            // InternalMyDot.g:868:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__DotExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__2"
    // InternalMyDot.g:877:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:881:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDot.g:882:2: rule__DotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__DotExpression__Group_1__2"


    // $ANTLR start "rule__DotExpression__Group_1__2__Impl"
    // InternalMyDot.g:888:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:892:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDot.g:893:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDot.g:893:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDot.g:894:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDot.g:895:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDot.g:895:3: rule__DotExpression__TailAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__TailAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 

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
    // $ANTLR end "rule__DotExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EntityRef__Group__0"
    // InternalMyDot.g:904:1: rule__EntityRef__Group__0 : rule__EntityRef__Group__0__Impl rule__EntityRef__Group__1 ;
    public final void rule__EntityRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:908:1: ( rule__EntityRef__Group__0__Impl rule__EntityRef__Group__1 )
            // InternalMyDot.g:909:2: rule__EntityRef__Group__0__Impl rule__EntityRef__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EntityRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityRef__Group__1();

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
    // $ANTLR end "rule__EntityRef__Group__0"


    // $ANTLR start "rule__EntityRef__Group__0__Impl"
    // InternalMyDot.g:916:1: rule__EntityRef__Group__0__Impl : ( () ) ;
    public final void rule__EntityRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:920:1: ( ( () ) )
            // InternalMyDot.g:921:1: ( () )
            {
            // InternalMyDot.g:921:1: ( () )
            // InternalMyDot.g:922:2: ()
            {
             before(grammarAccess.getEntityRefAccess().getEntityRefAction_0()); 
            // InternalMyDot.g:923:2: ()
            // InternalMyDot.g:923:3: 
            {
            }

             after(grammarAccess.getEntityRefAccess().getEntityRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRef__Group__0__Impl"


    // $ANTLR start "rule__EntityRef__Group__1"
    // InternalMyDot.g:931:1: rule__EntityRef__Group__1 : rule__EntityRef__Group__1__Impl ;
    public final void rule__EntityRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:935:1: ( rule__EntityRef__Group__1__Impl )
            // InternalMyDot.g:936:2: rule__EntityRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityRef__Group__1__Impl();

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
    // $ANTLR end "rule__EntityRef__Group__1"


    // $ANTLR start "rule__EntityRef__Group__1__Impl"
    // InternalMyDot.g:942:1: rule__EntityRef__Group__1__Impl : ( ( rule__EntityRef__EntityAssignment_1 ) ) ;
    public final void rule__EntityRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:946:1: ( ( ( rule__EntityRef__EntityAssignment_1 ) ) )
            // InternalMyDot.g:947:1: ( ( rule__EntityRef__EntityAssignment_1 ) )
            {
            // InternalMyDot.g:947:1: ( ( rule__EntityRef__EntityAssignment_1 ) )
            // InternalMyDot.g:948:2: ( rule__EntityRef__EntityAssignment_1 )
            {
             before(grammarAccess.getEntityRefAccess().getEntityAssignment_1()); 
            // InternalMyDot.g:949:2: ( rule__EntityRef__EntityAssignment_1 )
            // InternalMyDot.g:949:3: rule__EntityRef__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityRef__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityRefAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__EntityRef__Group__1__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment_0"
    // InternalMyDot.g:958:1: rule__Model__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:962:1: ( ( ruleEntity ) )
            // InternalMyDot.g:963:2: ( ruleEntity )
            {
            // InternalMyDot.g:963:2: ( ruleEntity )
            // InternalMyDot.g:964:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_0"


    // $ANTLR start "rule__Model__UsagesAssignment_1"
    // InternalMyDot.g:973:1: rule__Model__UsagesAssignment_1 : ( ruleUsage ) ;
    public final void rule__Model__UsagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:977:1: ( ( ruleUsage ) )
            // InternalMyDot.g:978:2: ( ruleUsage )
            {
            // InternalMyDot.g:978:2: ( ruleUsage )
            // InternalMyDot.g:979:3: ruleUsage
            {
             before(grammarAccess.getModelAccess().getUsagesUsageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUsagesUsageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__UsagesAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDot.g:988:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:992:1: ( ( RULE_ID ) )
            // InternalMyDot.g:993:2: ( RULE_ID )
            {
            // InternalMyDot.g:993:2: ( RULE_ID )
            // InternalMyDot.g:994:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_3"
    // InternalMyDot.g:1003:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1007:1: ( ( ruleFeature ) )
            // InternalMyDot.g:1008:2: ( ruleFeature )
            {
            // InternalMyDot.g:1008:2: ( ruleFeature )
            // InternalMyDot.g:1009:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDot.g:1018:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1022:1: ( ( RULE_ID ) )
            // InternalMyDot.g:1023:2: ( RULE_ID )
            {
            // InternalMyDot.g:1023:2: ( RULE_ID )
            // InternalMyDot.g:1024:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalMyDot.g:1033:1: rule__Attribute__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1037:1: ( ( ruleDataType ) )
            // InternalMyDot.g:1038:2: ( ruleDataType )
            {
            // InternalMyDot.g:1038:2: ( ruleDataType )
            // InternalMyDot.g:1039:3: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalMyDot.g:1048:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1052:1: ( ( RULE_ID ) )
            // InternalMyDot.g:1053:2: ( RULE_ID )
            {
            // InternalMyDot.g:1053:2: ( RULE_ID )
            // InternalMyDot.g:1054:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // InternalMyDot.g:1063:1: rule__Reference__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1067:1: ( ( ( RULE_ID ) ) )
            // InternalMyDot.g:1068:2: ( ( RULE_ID ) )
            {
            // InternalMyDot.g:1068:2: ( ( RULE_ID ) )
            // InternalMyDot.g:1069:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); 
            // InternalMyDot.g:1070:3: ( RULE_ID )
            // InternalMyDot.g:1071:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getTypeEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Usage__RefAssignment_1"
    // InternalMyDot.g:1082:1: rule__Usage__RefAssignment_1 : ( ruleDotExpression ) ;
    public final void rule__Usage__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1086:1: ( ( ruleDotExpression ) )
            // InternalMyDot.g:1087:2: ( ruleDotExpression )
            {
            // InternalMyDot.g:1087:2: ( ruleDotExpression )
            // InternalMyDot.g:1088:3: ruleDotExpression
            {
             before(grammarAccess.getUsageAccess().getRefDotExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getUsageAccess().getRefDotExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Usage__RefAssignment_1"


    // $ANTLR start "rule__DotExpression__TailAssignment_1_2"
    // InternalMyDot.g:1097:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1101:1: ( ( ( RULE_ID ) ) )
            // InternalMyDot.g:1102:2: ( ( RULE_ID ) )
            {
            // InternalMyDot.g:1102:2: ( ( RULE_ID ) )
            // InternalMyDot.g:1103:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailFeatureCrossReference_1_2_0()); 
            // InternalMyDot.g:1104:3: ( RULE_ID )
            // InternalMyDot.g:1105:4: RULE_ID
            {
             before(grammarAccess.getDotExpressionAccess().getTailFeatureIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getTailFeatureIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getDotExpressionAccess().getTailFeatureCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__DotExpression__TailAssignment_1_2"


    // $ANTLR start "rule__EntityRef__EntityAssignment_1"
    // InternalMyDot.g:1116:1: rule__EntityRef__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityRef__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDot.g:1120:1: ( ( ( RULE_ID ) ) )
            // InternalMyDot.g:1121:2: ( ( RULE_ID ) )
            {
            // InternalMyDot.g:1121:2: ( ( RULE_ID ) )
            // InternalMyDot.g:1122:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityRefAccess().getEntityEntityCrossReference_1_0()); 
            // InternalMyDot.g:1123:3: ( RULE_ID )
            // InternalMyDot.g:1124:4: RULE_ID
            {
             before(grammarAccess.getEntityRefAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityRefAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityRefAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__EntityRef__EntityAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});

}