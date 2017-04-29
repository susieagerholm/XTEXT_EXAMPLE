package org.xtext.example.mydot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydot.services.MyDotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'attr'", "':'", "'ref'", "'use'", "'.'", "'string'", "'int'"
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

        public InternalMyDotParser(TokenStream input, MyDotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDot.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDot.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDot.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDot.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_usages_1_0= ruleUsage ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_usages_1_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_usages_1_0= ruleUsage ) )* ) )
            // InternalMyDot.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_usages_1_0= ruleUsage ) )* )
            {
            // InternalMyDot.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_usages_1_0= ruleUsage ) )* )
            // InternalMyDot.g:80:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_usages_1_0= ruleUsage ) )*
            {
            // InternalMyDot.g:80:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDot.g:81:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalMyDot.g:81:4: (lv_entities_0_0= ruleEntity )
            	    // InternalMyDot.g:82:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"org.xtext.example.mydot.MyDot.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDot.g:99:3: ( (lv_usages_1_0= ruleUsage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDot.g:100:4: (lv_usages_1_0= ruleUsage )
            	    {
            	    // InternalMyDot.g:100:4: (lv_usages_1_0= ruleUsage )
            	    // InternalMyDot.g:101:5: lv_usages_1_0= ruleUsage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getUsagesUsageParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_usages_1_0=ruleUsage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"usages",
            	    						lv_usages_1_0,
            	    						"org.xtext.example.mydot.MyDot.Usage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDot.g:122:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDot.g:122:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDot.g:123:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDot.g:129:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:135:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // InternalMyDot.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // InternalMyDot.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // InternalMyDot.g:137:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDot.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDot.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDot.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalMyDot.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDot.g:163:3: ( (lv_features_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDot.g:164:4: (lv_features_3_0= ruleFeature )
            	    {
            	    // InternalMyDot.g:164:4: (lv_features_3_0= ruleFeature )
            	    // InternalMyDot.g:165:5: lv_features_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"org.xtext.example.mydot.MyDot.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalMyDot.g:190:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyDot.g:190:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyDot.g:191:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyDot.g:197:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalMyDot.g:203:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalMyDot.g:204:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalMyDot.g:204:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDot.g:205:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDot.g:214:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDot.g:226:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDot.g:226:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDot.g:227:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDot.g:233:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:239:2: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalMyDot.g:240:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalMyDot.g:240:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalMyDot.g:241:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttrKeyword_0());
            		
            // InternalMyDot.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDot.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDot.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalMyDot.g:247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalMyDot.g:267:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalMyDot.g:268:4: (lv_type_3_0= ruleDataType )
            {
            // InternalMyDot.g:268:4: (lv_type_3_0= ruleDataType )
            // InternalMyDot.g:269:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydot.MyDot.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalMyDot.g:290:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMyDot.g:290:50: (iv_ruleReference= ruleReference EOF )
            // InternalMyDot.g:291:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMyDot.g:297:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDot.g:303:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMyDot.g:304:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMyDot.g:304:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMyDot.g:305:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalMyDot.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDot.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDot.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalMyDot.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalMyDot.g:331:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDot.g:332:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDot.g:332:4: (otherlv_3= RULE_ID )
            // InternalMyDot.g:333:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getTypeEntityCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleUsage"
    // InternalMyDot.g:348:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // InternalMyDot.g:348:46: (iv_ruleUsage= ruleUsage EOF )
            // InternalMyDot.g:349:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // InternalMyDot.g:355:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'use' ( (lv_ref_1_0= ruleDotExpression ) ) ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:361:2: ( (otherlv_0= 'use' ( (lv_ref_1_0= ruleDotExpression ) ) ) )
            // InternalMyDot.g:362:2: (otherlv_0= 'use' ( (lv_ref_1_0= ruleDotExpression ) ) )
            {
            // InternalMyDot.g:362:2: (otherlv_0= 'use' ( (lv_ref_1_0= ruleDotExpression ) ) )
            // InternalMyDot.g:363:3: otherlv_0= 'use' ( (lv_ref_1_0= ruleDotExpression ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUseKeyword_0());
            		
            // InternalMyDot.g:367:3: ( (lv_ref_1_0= ruleDotExpression ) )
            // InternalMyDot.g:368:4: (lv_ref_1_0= ruleDotExpression )
            {
            // InternalMyDot.g:368:4: (lv_ref_1_0= ruleDotExpression )
            // InternalMyDot.g:369:5: lv_ref_1_0= ruleDotExpression
            {

            					newCompositeNode(grammarAccess.getUsageAccess().getRefDotExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleDotExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsageRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.xtext.example.mydot.MyDot.DotExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDot.g:390:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalMyDot.g:390:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalMyDot.g:391:2: iv_ruleDotExpression= ruleDotExpression EOF
            {
             newCompositeNode(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDotExpression=ruleDotExpression();

            state._fsp--;

             current =iv_ruleDotExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyDot.g:397:1: ruleDotExpression returns [EObject current=null] : (this_EntityRef_0= ruleEntityRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_EntityRef_0 = null;



        	enterRule();

        try {
            // InternalMyDot.g:403:2: ( (this_EntityRef_0= ruleEntityRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDot.g:404:2: (this_EntityRef_0= ruleEntityRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDot.g:404:2: (this_EntityRef_0= ruleEntityRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDot.g:405:3: this_EntityRef_0= ruleEntityRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getDotExpressionAccess().getEntityRefParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EntityRef_0=ruleEntityRef();

            state._fsp--;


            			current = this_EntityRef_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDot.g:413:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDot.g:414:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMyDot.g:414:4: ()
            	    // InternalMyDot.g:415:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMyDot.g:425:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDot.g:426:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDot.g:426:5: (otherlv_3= RULE_ID )
            	    // InternalMyDot.g:427:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDotExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailFeatureCrossReference_1_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleEntityRef"
    // InternalMyDot.g:443:1: entryRuleEntityRef returns [EObject current=null] : iv_ruleEntityRef= ruleEntityRef EOF ;
    public final EObject entryRuleEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRef = null;


        try {
            // InternalMyDot.g:443:50: (iv_ruleEntityRef= ruleEntityRef EOF )
            // InternalMyDot.g:444:2: iv_ruleEntityRef= ruleEntityRef EOF
            {
             newCompositeNode(grammarAccess.getEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRef=ruleEntityRef();

            state._fsp--;

             current =iv_ruleEntityRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityRef"


    // $ANTLR start "ruleEntityRef"
    // InternalMyDot.g:450:1: ruleEntityRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDot.g:456:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDot.g:457:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDot.g:457:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDot.g:458:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMyDot.g:458:3: ()
            // InternalMyDot.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityRefAccess().getEntityRefAction_0(),
            					current);
            			

            }

            // InternalMyDot.g:465:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDot.g:466:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDot.g:466:4: (otherlv_1= RULE_ID )
            // InternalMyDot.g:467:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEntityRefAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityRef"


    // $ANTLR start "ruleDataType"
    // InternalMyDot.g:482:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDot.g:488:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) ) )
            // InternalMyDot.g:489:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) )
            {
            // InternalMyDot.g:489:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDot.g:490:3: (enumLiteral_0= 'string' )
                    {
                    // InternalMyDot.g:490:3: (enumLiteral_0= 'string' )
                    // InternalMyDot.g:491:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDot.g:498:3: (enumLiteral_1= 'int' )
                    {
                    // InternalMyDot.g:498:3: (enumLiteral_1= 'int' )
                    // InternalMyDot.g:499:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});

}