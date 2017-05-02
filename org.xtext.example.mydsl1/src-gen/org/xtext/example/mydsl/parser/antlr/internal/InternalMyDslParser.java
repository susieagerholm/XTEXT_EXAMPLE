package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'{'", "'}'", "','", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_methods_0_0= ruleMethod ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_methods_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_methods_0_0= ruleMethod ) )* )
            // InternalMyDsl.g:78:2: ( (lv_methods_0_0= ruleMethod ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_methods_0_0= ruleMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_methods_0_0= ruleMethod )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_methods_0_0= ruleMethod )
            	    // InternalMyDsl.g:80:4: lv_methods_0_0= ruleMethod
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMethodsMethodParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_methods_0_0=ruleMethod();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"methods",
            	    					lv_methods_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Method");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:100:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMyDsl.g:101:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:107:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )* otherlv_4= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_definitionBlocks_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )* otherlv_4= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getDefKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_definitionBlocks_3_0= ruleDefinitionBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_definitionBlocks_3_0= ruleDefinitionBlock )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_definitionBlocks_3_0= ruleDefinitionBlock )
            	    // InternalMyDsl.g:143:5: lv_definitionBlocks_3_0= ruleDefinitionBlock
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getDefinitionBlocksDefinitionBlockParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_definitionBlocks_3_0=ruleDefinitionBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitionBlocks",
            	    						lv_definitionBlocks_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.DefinitionBlock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefinitionBlock"
    // InternalMyDsl.g:168:1: entryRuleDefinitionBlock returns [EObject current=null] : iv_ruleDefinitionBlock= ruleDefinitionBlock EOF ;
    public final EObject entryRuleDefinitionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBlock = null;


        try {
            // InternalMyDsl.g:168:56: (iv_ruleDefinitionBlock= ruleDefinitionBlock EOF )
            // InternalMyDsl.g:169:2: iv_ruleDefinitionBlock= ruleDefinitionBlock EOF
            {
             newCompositeNode(grammarAccess.getDefinitionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionBlock=ruleDefinitionBlock();

            state._fsp--;

             current =iv_ruleDefinitionBlock; 
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
    // $ANTLR end "entryRuleDefinitionBlock"


    // $ANTLR start "ruleDefinitionBlock"
    // InternalMyDsl.g:175:1: ruleDefinitionBlock returns [EObject current=null] : ( ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) ) (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )* otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinitionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        EObject lv_variableDefinitions_0_0 = null;

        EObject lv_variableDefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( ( ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) ) (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )* otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:182:2: ( ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) ) (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )* otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:182:2: ( ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) ) (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )* otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:183:3: ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) ) (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )* otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) )
            {
            // InternalMyDsl.g:183:3: ( (lv_variableDefinitions_0_0= ruleVariableDefinition ) )
            // InternalMyDsl.g:184:4: (lv_variableDefinitions_0_0= ruleVariableDefinition )
            {
            // InternalMyDsl.g:184:4: (lv_variableDefinitions_0_0= ruleVariableDefinition )
            // InternalMyDsl.g:185:5: lv_variableDefinitions_0_0= ruleVariableDefinition
            {

            					newCompositeNode(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_variableDefinitions_0_0=ruleVariableDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionBlockRule());
            					}
            					add(
            						current,
            						"variableDefinitions",
            						lv_variableDefinitions_0_0,
            						"org.xtext.example.mydsl.MyDsl.VariableDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:202:3: (otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:203:4: otherlv_1= ',' ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDefinitionBlockAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:207:4: ( (lv_variableDefinitions_2_0= ruleVariableDefinition ) )
            	    // InternalMyDsl.g:208:5: (lv_variableDefinitions_2_0= ruleVariableDefinition )
            	    {
            	    // InternalMyDsl.g:208:5: (lv_variableDefinitions_2_0= ruleVariableDefinition )
            	    // InternalMyDsl.g:209:6: lv_variableDefinitions_2_0= ruleVariableDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_variableDefinitions_2_0=ruleVariableDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableDefinitions",
            	    							lv_variableDefinitions_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.VariableDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionBlockAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:231:3: ( (lv_type_4_0= RULE_ID ) )
            // InternalMyDsl.g:232:4: (lv_type_4_0= RULE_ID )
            {
            // InternalMyDsl.g:232:4: (lv_type_4_0= RULE_ID )
            // InternalMyDsl.g:233:5: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_4_0, grammarAccess.getDefinitionBlockAccess().getTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDefinitionBlock"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalMyDsl.g:253:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalMyDsl.g:253:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalMyDsl.g:254:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalMyDsl.g:260:1: ruleVariableDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:266:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:267:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:267:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:268:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:268:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:269:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableDefinitionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});

}