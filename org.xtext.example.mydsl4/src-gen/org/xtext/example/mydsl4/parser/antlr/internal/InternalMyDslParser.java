package org.xtext.example.mydsl4.parser.antlr.internal;

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
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Topology'", "'Link'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'->'", "'r->'", "'p->'", "'c->'", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_topologies_3_0 = null;

        EObject lv_link_4_0 = null;

        EObject lv_joint_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getTopologyKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_topologies_3_0= ruleTopology ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:107:4: (lv_topologies_3_0= ruleTopology )
            	    {
            	    // InternalMyDsl.g:107:4: (lv_topologies_3_0= ruleTopology )
            	    // InternalMyDsl.g:108:5: lv_topologies_3_0= ruleTopology
            	    {

            	    					newCompositeNode(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_topologies_3_0=ruleTopology();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"topologies",
            	    						lv_topologies_3_0,
            	    						"org.xtext.example.mydsl4.MyDsl.Topology");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMyDsl.g:125:3: ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }
                else if ( (LA2_0==14) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:126:4: ( (lv_link_4_0= ruleLink ) )
            	    {
            	    // InternalMyDsl.g:126:4: ( (lv_link_4_0= ruleLink ) )
            	    // InternalMyDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    // InternalMyDsl.g:128:6: lv_link_4_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_link_4_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"link",
            	    							lv_link_4_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:146:4: ( (lv_joint_5_0= ruleJoint ) )
            	    {
            	    // InternalMyDsl.g:146:4: ( (lv_joint_5_0= ruleJoint ) )
            	    // InternalMyDsl.g:147:5: (lv_joint_5_0= ruleJoint )
            	    {
            	    // InternalMyDsl.g:147:5: (lv_joint_5_0= ruleJoint )
            	    // InternalMyDsl.g:148:6: lv_joint_5_0= ruleJoint
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_joint_5_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_5_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Joint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleTopology"
    // InternalMyDsl.g:170:1: entryRuleTopology returns [EObject current=null] : iv_ruleTopology= ruleTopology EOF ;
    public final EObject entryRuleTopology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopology = null;


        try {
            // InternalMyDsl.g:170:49: (iv_ruleTopology= ruleTopology EOF )
            // InternalMyDsl.g:171:2: iv_ruleTopology= ruleTopology EOF
            {
             newCompositeNode(grammarAccess.getTopologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopology=ruleTopology();

            state._fsp--;

             current =iv_ruleTopology; 
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
    // $ANTLR end "entryRuleTopology"


    // $ANTLR start "ruleTopology"
    // InternalMyDsl.g:177:1: ruleTopology returns [EObject current=null] : ( ( (lv_parent_0_0= RULE_STRING ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) ;
    public final EObject ruleTopology() throws RecognitionException {
        EObject current = null;

        Token lv_parent_0_0=null;
        EObject lv_joint_1_0 = null;

        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:183:2: ( ( ( (lv_parent_0_0= RULE_STRING ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) )
            // InternalMyDsl.g:184:2: ( ( (lv_parent_0_0= RULE_STRING ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            {
            // InternalMyDsl.g:184:2: ( ( (lv_parent_0_0= RULE_STRING ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            // InternalMyDsl.g:185:3: ( (lv_parent_0_0= RULE_STRING ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            {
            // InternalMyDsl.g:185:3: ( (lv_parent_0_0= RULE_STRING ) )
            // InternalMyDsl.g:186:4: (lv_parent_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:186:4: (lv_parent_0_0= RULE_STRING )
            // InternalMyDsl.g:187:5: lv_parent_0_0= RULE_STRING
            {
            lv_parent_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_parent_0_0, grammarAccess.getTopologyAccess().getParentSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parent",
            						lv_parent_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:203:3: ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=21)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:204:4: ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) )
                    {
                    // InternalMyDsl.g:204:4: ( (lv_joint_1_0= ruleJointRef ) )
                    // InternalMyDsl.g:205:5: (lv_joint_1_0= ruleJointRef )
                    {
                    // InternalMyDsl.g:205:5: (lv_joint_1_0= ruleJointRef )
                    // InternalMyDsl.g:206:6: lv_joint_1_0= ruleJointRef
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_joint_1_0=ruleJointRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"joint",
                    							lv_joint_1_0,
                    							"org.xtext.example.mydsl4.MyDsl.JointRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:223:4: ( (lv_child_2_0= ruleTopology ) )
                    // InternalMyDsl.g:224:5: (lv_child_2_0= ruleTopology )
                    {
                    // InternalMyDsl.g:224:5: (lv_child_2_0= ruleTopology )
                    // InternalMyDsl.g:225:6: lv_child_2_0= ruleTopology
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_child_2_0=ruleTopology();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.xtext.example.mydsl4.MyDsl.Topology");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTopology"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:247:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:247:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:248:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:254:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:260:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:261:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:261:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:262:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:267:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:288:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalMyDsl.g:288:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalMyDsl.g:289:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
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
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalMyDsl.g:295:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_Type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:301:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalMyDsl.g:302:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalMyDsl.g:302:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) )
            // InternalMyDsl.g:303:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalMyDsl.g:307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:308:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:309:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getTypeKeyword_2());
            		
            // InternalMyDsl.g:329:3: ( (lv_Type_3_0= ruleJointType ) )
            // InternalMyDsl.g:330:4: (lv_Type_3_0= ruleJointType )
            {
            // InternalMyDsl.g:330:4: (lv_Type_3_0= ruleJointType )
            // InternalMyDsl.g:331:5: lv_Type_3_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_Type_3_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_3_0,
            						"org.xtext.example.mydsl4.MyDsl.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_4());
            		
            // InternalMyDsl.g:352:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:353:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:353:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:354:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfKeyword_6());
            		
            // InternalMyDsl.g:369:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:370:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:370:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:371:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0());
            				

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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleJointRef"
    // InternalMyDsl.g:386:1: entryRuleJointRef returns [EObject current=null] : iv_ruleJointRef= ruleJointRef EOF ;
    public final EObject entryRuleJointRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointRef = null;


        try {
            // InternalMyDsl.g:386:49: (iv_ruleJointRef= ruleJointRef EOF )
            // InternalMyDsl.g:387:2: iv_ruleJointRef= ruleJointRef EOF
            {
             newCompositeNode(grammarAccess.getJointRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointRef=ruleJointRef();

            state._fsp--;

             current =iv_ruleJointRef; 
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
    // $ANTLR end "entryRuleJointRef"


    // $ANTLR start "ruleJointRef"
    // InternalMyDsl.g:393:1: ruleJointRef returns [EObject current=null] : ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) ;
    public final EObject ruleJointRef() throws RecognitionException {
        EObject current = null;

        Token lv_fix_0_0=null;
        Token lv_rev_1_0=null;
        Token lv_pris_2_0=null;
        Token lv_cont_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:399:2: ( ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) )
            // InternalMyDsl.g:400:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            {
            // InternalMyDsl.g:400:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:401:3: ( (lv_fix_0_0= '->' ) )
                    {
                    // InternalMyDsl.g:401:3: ( (lv_fix_0_0= '->' ) )
                    // InternalMyDsl.g:402:4: (lv_fix_0_0= '->' )
                    {
                    // InternalMyDsl.g:402:4: (lv_fix_0_0= '->' )
                    // InternalMyDsl.g:403:5: lv_fix_0_0= '->'
                    {
                    lv_fix_0_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_fix_0_0, grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "fix", lv_fix_0_0, "->");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:416:3: ( (lv_rev_1_0= 'r->' ) )
                    {
                    // InternalMyDsl.g:416:3: ( (lv_rev_1_0= 'r->' ) )
                    // InternalMyDsl.g:417:4: (lv_rev_1_0= 'r->' )
                    {
                    // InternalMyDsl.g:417:4: (lv_rev_1_0= 'r->' )
                    // InternalMyDsl.g:418:5: lv_rev_1_0= 'r->'
                    {
                    lv_rev_1_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_rev_1_0, grammarAccess.getJointRefAccess().getRevRKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "rev", lv_rev_1_0, "r->");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:431:3: ( (lv_pris_2_0= 'p->' ) )
                    {
                    // InternalMyDsl.g:431:3: ( (lv_pris_2_0= 'p->' ) )
                    // InternalMyDsl.g:432:4: (lv_pris_2_0= 'p->' )
                    {
                    // InternalMyDsl.g:432:4: (lv_pris_2_0= 'p->' )
                    // InternalMyDsl.g:433:5: lv_pris_2_0= 'p->'
                    {
                    lv_pris_2_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_pris_2_0, grammarAccess.getJointRefAccess().getPrisPKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "pris", lv_pris_2_0, "p->");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:446:3: ( (lv_cont_3_0= 'c->' ) )
                    {
                    // InternalMyDsl.g:446:3: ( (lv_cont_3_0= 'c->' ) )
                    // InternalMyDsl.g:447:4: (lv_cont_3_0= 'c->' )
                    {
                    // InternalMyDsl.g:447:4: (lv_cont_3_0= 'c->' )
                    // InternalMyDsl.g:448:5: lv_cont_3_0= 'c->'
                    {
                    lv_cont_3_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_cont_3_0, grammarAccess.getJointRefAccess().getContCKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "cont", lv_cont_3_0, "c->");
                    				

                    }


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
    // $ANTLR end "ruleJointRef"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:464:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:470:2: ( ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) )
            // InternalMyDsl.g:471:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            {
            // InternalMyDsl.g:471:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:472:3: (enumLiteral_0= 'Fixed' )
                    {
                    // InternalMyDsl.g:472:3: (enumLiteral_0= 'Fixed' )
                    // InternalMyDsl.g:473:4: enumLiteral_0= 'Fixed'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:3: (enumLiteral_1= 'Revolute' )
                    {
                    // InternalMyDsl.g:480:3: (enumLiteral_1= 'Revolute' )
                    // InternalMyDsl.g:481:4: enumLiteral_1= 'Revolute'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:488:3: (enumLiteral_2= 'Prismatic' )
                    {
                    // InternalMyDsl.g:488:3: (enumLiteral_2= 'Prismatic' )
                    // InternalMyDsl.g:489:4: enumLiteral_2= 'Prismatic'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:496:3: (enumLiteral_3= 'Continuous' )
                    {
                    // InternalMyDsl.g:496:3: (enumLiteral_3= 'Continuous' )
                    // InternalMyDsl.g:497:4: enumLiteral_3= 'Continuous'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});

}