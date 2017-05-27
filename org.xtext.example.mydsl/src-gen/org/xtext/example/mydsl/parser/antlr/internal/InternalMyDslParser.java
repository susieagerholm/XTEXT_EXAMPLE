package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Topology'", "'Link'", "'isReuseOf'", "'add_to'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'->'", "'r->'", "'p->'", "'c->'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Origin'", "'xyz'", "'roll_pitch_yaw'", "'Mass'", "'massValueInKilograms'", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'"
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
    // InternalMyDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_topologies_3_0 = null;

        EObject lv_link_4_0 = null;

        EObject lv_joint_5_0 = null;

        EObject lv_linkrefs_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )+ ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )*
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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getTopologyKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_topologies_3_0= ruleTopology ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
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
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_topologies_3_0=ruleTopology();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"topologies",
            	    						lv_topologies_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Topology");
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

            // InternalMyDsl.g:125:3: ( ( (lv_link_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_linkrefs_6_0= ruleLinkRef ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt2=1;
                    }
                    break;
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                case 15:
                    {
                    alt2=3;
                    }
                    break;

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
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_link_4_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"link",
            	    							lv_link_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Link");
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
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_joint_5_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Joint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:166:4: ( (lv_linkrefs_6_0= ruleLinkRef ) )
            	    {
            	    // InternalMyDsl.g:166:4: ( (lv_linkrefs_6_0= ruleLinkRef ) )
            	    // InternalMyDsl.g:167:5: (lv_linkrefs_6_0= ruleLinkRef )
            	    {
            	    // InternalMyDsl.g:167:5: (lv_linkrefs_6_0= ruleLinkRef )
            	    // InternalMyDsl.g:168:6: lv_linkrefs_6_0= ruleLinkRef
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkrefsLinkRefParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_linkrefs_6_0=ruleLinkRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"linkrefs",
            	    							lv_linkrefs_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.LinkRef");
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
    // InternalMyDsl.g:190:1: entryRuleTopology returns [EObject current=null] : iv_ruleTopology= ruleTopology EOF ;
    public final EObject entryRuleTopology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopology = null;


        try {
            // InternalMyDsl.g:190:49: (iv_ruleTopology= ruleTopology EOF )
            // InternalMyDsl.g:191:2: iv_ruleTopology= ruleTopology EOF
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
    // InternalMyDsl.g:197:1: ruleTopology returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) ;
    public final EObject ruleTopology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_joint_1_0 = null;

        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:203:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) )
            // InternalMyDsl.g:204:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            {
            // InternalMyDsl.g:204:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            // InternalMyDsl.g:205:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            {
            // InternalMyDsl.g:205:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:206:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:206:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:207:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:218:3: ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=23)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:219:4: ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) )
                    {
                    // InternalMyDsl.g:219:4: ( (lv_joint_1_0= ruleJointRef ) )
                    // InternalMyDsl.g:220:5: (lv_joint_1_0= ruleJointRef )
                    {
                    // InternalMyDsl.g:220:5: (lv_joint_1_0= ruleJointRef )
                    // InternalMyDsl.g:221:6: lv_joint_1_0= ruleJointRef
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_joint_1_0=ruleJointRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"joint",
                    							lv_joint_1_0,
                    							"org.xtext.example.mydsl.MyDsl.JointRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:238:4: ( (lv_child_2_0= ruleTopology ) )
                    // InternalMyDsl.g:239:5: (lv_child_2_0= ruleTopology )
                    {
                    // InternalMyDsl.g:239:5: (lv_child_2_0= ruleTopology )
                    // InternalMyDsl.g:240:6: lv_child_2_0= ruleTopology
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
                    							"org.xtext.example.mydsl.MyDsl.Topology");
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
    // InternalMyDsl.g:262:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:262:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:263:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:269:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_decorator_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:275:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) ) )
            // InternalMyDsl.g:276:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) )
            {
            // InternalMyDsl.g:276:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) ) )
            // InternalMyDsl.g:277:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? ( (lv_decorator_4_0= ruleLinkDecorator ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalMyDsl.g:299:3: (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:300:4: otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getIsReuseOfKeyword_2_0());
                    			
                    // InternalMyDsl.g:304:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:305:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:305:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:306:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:318:3: ( (lv_decorator_4_0= ruleLinkDecorator ) )
            // InternalMyDsl.g:319:4: (lv_decorator_4_0= ruleLinkDecorator )
            {
            // InternalMyDsl.g:319:4: (lv_decorator_4_0= ruleLinkDecorator )
            // InternalMyDsl.g:320:5: lv_decorator_4_0= ruleLinkDecorator
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDecoratorLinkDecoratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_decorator_4_0=ruleLinkDecorator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"decorator",
            						lv_decorator_4_0,
            						"org.xtext.example.mydsl.MyDsl.LinkDecorator");
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleLinkDecorator"
    // InternalMyDsl.g:341:1: entryRuleLinkDecorator returns [EObject current=null] : iv_ruleLinkDecorator= ruleLinkDecorator EOF ;
    public final EObject entryRuleLinkDecorator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkDecorator = null;


        try {
            // InternalMyDsl.g:341:54: (iv_ruleLinkDecorator= ruleLinkDecorator EOF )
            // InternalMyDsl.g:342:2: iv_ruleLinkDecorator= ruleLinkDecorator EOF
            {
             newCompositeNode(grammarAccess.getLinkDecoratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkDecorator=ruleLinkDecorator();

            state._fsp--;

             current =iv_ruleLinkDecorator; 
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
    // $ANTLR end "entryRuleLinkDecorator"


    // $ANTLR start "ruleLinkDecorator"
    // InternalMyDsl.g:348:1: ruleLinkDecorator returns [EObject current=null] : ( () ( (lv_inert_1_0= ruleInertia ) )* ) ;
    public final EObject ruleLinkDecorator() throws RecognitionException {
        EObject current = null;

        EObject lv_inert_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:354:2: ( ( () ( (lv_inert_1_0= ruleInertia ) )* ) )
            // InternalMyDsl.g:355:2: ( () ( (lv_inert_1_0= ruleInertia ) )* )
            {
            // InternalMyDsl.g:355:2: ( () ( (lv_inert_1_0= ruleInertia ) )* )
            // InternalMyDsl.g:356:3: () ( (lv_inert_1_0= ruleInertia ) )*
            {
            // InternalMyDsl.g:356:3: ()
            // InternalMyDsl.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkDecoratorAccess().getLinkDecoratorAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:363:3: ( (lv_inert_1_0= ruleInertia ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:364:4: (lv_inert_1_0= ruleInertia )
            	    {
            	    // InternalMyDsl.g:364:4: (lv_inert_1_0= ruleInertia )
            	    // InternalMyDsl.g:365:5: lv_inert_1_0= ruleInertia
            	    {

            	    					newCompositeNode(grammarAccess.getLinkDecoratorAccess().getInertInertiaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_inert_1_0=ruleInertia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkDecoratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inert",
            	    						lv_inert_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Inertia");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleLinkDecorator"


    // $ANTLR start "entryRuleLinkRef"
    // InternalMyDsl.g:386:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // InternalMyDsl.g:386:48: (iv_ruleLinkRef= ruleLinkRef EOF )
            // InternalMyDsl.g:387:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             newCompositeNode(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkRef=ruleLinkRef();

            state._fsp--;

             current =iv_ruleLinkRef; 
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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalMyDsl.g:393:1: ruleLinkRef returns [EObject current=null] : (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:399:2: ( (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:400:2: (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:400:2: (otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:401:3: otherlv_0= 'add_to' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkRefAccess().getAdd_toKeyword_0());
            		
            // InternalMyDsl.g:405:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:406:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:406:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:407:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkRefAccess().getRefLinkCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:418:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:419:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:419:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:420:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRefRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLinkRefAccess().getDecoratorLinkDecoratorCrossReference_2_0());
            				

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
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:435:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalMyDsl.g:435:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalMyDsl.g:436:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalMyDsl.g:442:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'Type' ( (lv_Type_9_0= ruleJointType ) ) ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_Type_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:448:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'Type' ( (lv_Type_9_0= ruleJointType ) ) ) )
            // InternalMyDsl.g:449:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'Type' ( (lv_Type_9_0= ruleJointType ) ) )
            {
            // InternalMyDsl.g:449:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'Type' ( (lv_Type_9_0= ruleJointType ) ) )
            // InternalMyDsl.g:450:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'Type' ( (lv_Type_9_0= ruleJointType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalMyDsl.g:454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:455:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalMyDsl.g:472:3: (otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:473:4: otherlv_2= 'isReuseOf' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getJointAccess().getIsReuseOfKeyword_2_0());
                    			
                    // InternalMyDsl.g:477:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:478:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:478:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:479:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJointRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_3());
            		
            // InternalMyDsl.g:495:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:496:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:496:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:497:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfKeyword_5());
            		
            // InternalMyDsl.g:512:3: ( (otherlv_7= RULE_ID ) )
            // InternalMyDsl.g:513:4: (otherlv_7= RULE_ID )
            {
            // InternalMyDsl.g:513:4: (otherlv_7= RULE_ID )
            // InternalMyDsl.g:514:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0());
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getTypeKeyword_7());
            		
            // InternalMyDsl.g:529:3: ( (lv_Type_9_0= ruleJointType ) )
            // InternalMyDsl.g:530:4: (lv_Type_9_0= ruleJointType )
            {
            // InternalMyDsl.g:530:4: (lv_Type_9_0= ruleJointType )
            // InternalMyDsl.g:531:5: lv_Type_9_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_Type_9_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_9_0,
            						"org.xtext.example.mydsl.MyDsl.JointType");
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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleJointRef"
    // InternalMyDsl.g:552:1: entryRuleJointRef returns [EObject current=null] : iv_ruleJointRef= ruleJointRef EOF ;
    public final EObject entryRuleJointRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointRef = null;


        try {
            // InternalMyDsl.g:552:49: (iv_ruleJointRef= ruleJointRef EOF )
            // InternalMyDsl.g:553:2: iv_ruleJointRef= ruleJointRef EOF
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
    // InternalMyDsl.g:559:1: ruleJointRef returns [EObject current=null] : ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) ;
    public final EObject ruleJointRef() throws RecognitionException {
        EObject current = null;

        Token lv_fix_0_0=null;
        Token lv_rev_1_0=null;
        Token lv_pris_2_0=null;
        Token lv_cont_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:565:2: ( ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) )
            // InternalMyDsl.g:566:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            {
            // InternalMyDsl.g:566:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:567:3: ( (lv_fix_0_0= '->' ) )
                    {
                    // InternalMyDsl.g:567:3: ( (lv_fix_0_0= '->' ) )
                    // InternalMyDsl.g:568:4: (lv_fix_0_0= '->' )
                    {
                    // InternalMyDsl.g:568:4: (lv_fix_0_0= '->' )
                    // InternalMyDsl.g:569:5: lv_fix_0_0= '->'
                    {
                    lv_fix_0_0=(Token)match(input,20,FOLLOW_2); 

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
                    // InternalMyDsl.g:582:3: ( (lv_rev_1_0= 'r->' ) )
                    {
                    // InternalMyDsl.g:582:3: ( (lv_rev_1_0= 'r->' ) )
                    // InternalMyDsl.g:583:4: (lv_rev_1_0= 'r->' )
                    {
                    // InternalMyDsl.g:583:4: (lv_rev_1_0= 'r->' )
                    // InternalMyDsl.g:584:5: lv_rev_1_0= 'r->'
                    {
                    lv_rev_1_0=(Token)match(input,21,FOLLOW_2); 

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
                    // InternalMyDsl.g:597:3: ( (lv_pris_2_0= 'p->' ) )
                    {
                    // InternalMyDsl.g:597:3: ( (lv_pris_2_0= 'p->' ) )
                    // InternalMyDsl.g:598:4: (lv_pris_2_0= 'p->' )
                    {
                    // InternalMyDsl.g:598:4: (lv_pris_2_0= 'p->' )
                    // InternalMyDsl.g:599:5: lv_pris_2_0= 'p->'
                    {
                    lv_pris_2_0=(Token)match(input,22,FOLLOW_2); 

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
                    // InternalMyDsl.g:612:3: ( (lv_cont_3_0= 'c->' ) )
                    {
                    // InternalMyDsl.g:612:3: ( (lv_cont_3_0= 'c->' ) )
                    // InternalMyDsl.g:613:4: (lv_cont_3_0= 'c->' )
                    {
                    // InternalMyDsl.g:613:4: (lv_cont_3_0= 'c->' )
                    // InternalMyDsl.g:614:5: lv_cont_3_0= 'c->'
                    {
                    lv_cont_3_0=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInertia"
    // InternalMyDsl.g:630:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalMyDsl.g:630:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalMyDsl.g:631:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
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
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalMyDsl.g:637:1: ruleInertia returns [EObject current=null] : (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= RULE_INT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= RULE_INT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= RULE_INT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= RULE_INT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= RULE_INT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= RULE_INT ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_ixx_3_0=null;
        Token otherlv_4=null;
        Token lv_ixy_5_0=null;
        Token otherlv_6=null;
        Token lv_ixz_7_0=null;
        Token otherlv_8=null;
        Token lv_iyy_9_0=null;
        Token otherlv_10=null;
        Token lv_iyz_11_0=null;
        Token otherlv_12=null;
        Token lv_izz_13_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:643:2: ( (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= RULE_INT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= RULE_INT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= RULE_INT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= RULE_INT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= RULE_INT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:644:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= RULE_INT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= RULE_INT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= RULE_INT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= RULE_INT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= RULE_INT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:644:2: (otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= RULE_INT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= RULE_INT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= RULE_INT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= RULE_INT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= RULE_INT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= RULE_INT ) ) )
            // InternalMyDsl.g:645:3: otherlv_0= 'Inertia' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ixx' ( (lv_ixx_3_0= RULE_INT ) ) otherlv_4= 'ixy' ( (lv_ixy_5_0= RULE_INT ) ) otherlv_6= 'ixz' ( (lv_ixz_7_0= RULE_INT ) ) otherlv_8= 'iyy' ( (lv_iyy_9_0= RULE_INT ) ) otherlv_10= 'iyz' ( (lv_iyz_11_0= RULE_INT ) ) otherlv_12= 'izz' ( (lv_izz_13_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInertiaAccess().getInertiaKeyword_0());
            		
            // InternalMyDsl.g:649:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:650:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:650:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:651:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertiaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInertiaAccess().getIxxKeyword_2());
            		
            // InternalMyDsl.g:671:3: ( (lv_ixx_3_0= RULE_INT ) )
            // InternalMyDsl.g:672:4: (lv_ixx_3_0= RULE_INT )
            {
            // InternalMyDsl.g:672:4: (lv_ixx_3_0= RULE_INT )
            // InternalMyDsl.g:673:5: lv_ixx_3_0= RULE_INT
            {
            lv_ixx_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_ixx_3_0, grammarAccess.getInertiaAccess().getIxxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ixx",
            						lv_ixx_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getInertiaAccess().getIxyKeyword_4());
            		
            // InternalMyDsl.g:693:3: ( (lv_ixy_5_0= RULE_INT ) )
            // InternalMyDsl.g:694:4: (lv_ixy_5_0= RULE_INT )
            {
            // InternalMyDsl.g:694:4: (lv_ixy_5_0= RULE_INT )
            // InternalMyDsl.g:695:5: lv_ixy_5_0= RULE_INT
            {
            lv_ixy_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_ixy_5_0, grammarAccess.getInertiaAccess().getIxyINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ixy",
            						lv_ixy_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getInertiaAccess().getIxzKeyword_6());
            		
            // InternalMyDsl.g:715:3: ( (lv_ixz_7_0= RULE_INT ) )
            // InternalMyDsl.g:716:4: (lv_ixz_7_0= RULE_INT )
            {
            // InternalMyDsl.g:716:4: (lv_ixz_7_0= RULE_INT )
            // InternalMyDsl.g:717:5: lv_ixz_7_0= RULE_INT
            {
            lv_ixz_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_ixz_7_0, grammarAccess.getInertiaAccess().getIxzINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ixz",
            						lv_ixz_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getInertiaAccess().getIyyKeyword_8());
            		
            // InternalMyDsl.g:737:3: ( (lv_iyy_9_0= RULE_INT ) )
            // InternalMyDsl.g:738:4: (lv_iyy_9_0= RULE_INT )
            {
            // InternalMyDsl.g:738:4: (lv_iyy_9_0= RULE_INT )
            // InternalMyDsl.g:739:5: lv_iyy_9_0= RULE_INT
            {
            lv_iyy_9_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_iyy_9_0, grammarAccess.getInertiaAccess().getIyyINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iyy",
            						lv_iyy_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getInertiaAccess().getIyzKeyword_10());
            		
            // InternalMyDsl.g:759:3: ( (lv_iyz_11_0= RULE_INT ) )
            // InternalMyDsl.g:760:4: (lv_iyz_11_0= RULE_INT )
            {
            // InternalMyDsl.g:760:4: (lv_iyz_11_0= RULE_INT )
            // InternalMyDsl.g:761:5: lv_iyz_11_0= RULE_INT
            {
            lv_iyz_11_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_iyz_11_0, grammarAccess.getInertiaAccess().getIyzINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iyz",
            						lv_iyz_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getInertiaAccess().getIzzKeyword_12());
            		
            // InternalMyDsl.g:781:3: ( (lv_izz_13_0= RULE_INT ) )
            // InternalMyDsl.g:782:4: (lv_izz_13_0= RULE_INT )
            {
            // InternalMyDsl.g:782:4: (lv_izz_13_0= RULE_INT )
            // InternalMyDsl.g:783:5: lv_izz_13_0= RULE_INT
            {
            lv_izz_13_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_izz_13_0, grammarAccess.getInertiaAccess().getIzzINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInertiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"izz",
            						lv_izz_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleOrigin"
    // InternalMyDsl.g:803:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalMyDsl.g:803:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalMyDsl.g:804:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
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
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalMyDsl.g:810:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ( (lv_z_5_0= RULE_INT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token lv_y_4_0=null;
        Token lv_z_5_0=null;
        Token otherlv_6=null;
        Token lv_roll_7_0=null;
        Token lv_pitch_8_0=null;
        Token lv_yaw_9_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:816:2: ( (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ( (lv_z_5_0= RULE_INT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )? ) )
            // InternalMyDsl.g:817:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ( (lv_z_5_0= RULE_INT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )? )
            {
            // InternalMyDsl.g:817:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ( (lv_z_5_0= RULE_INT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )? )
            // InternalMyDsl.g:818:3: otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= RULE_INT ) ) ( (lv_y_4_0= RULE_INT ) ) ( (lv_z_5_0= RULE_INT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            // InternalMyDsl.g:822:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:823:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:823:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:824:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOriginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOriginAccess().getXyzKeyword_2());
            		
            // InternalMyDsl.g:844:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalMyDsl.g:845:4: (lv_x_3_0= RULE_INT )
            {
            // InternalMyDsl.g:845:4: (lv_x_3_0= RULE_INT )
            // InternalMyDsl.g:846:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_x_3_0, grammarAccess.getOriginAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:862:3: ( (lv_y_4_0= RULE_INT ) )
            // InternalMyDsl.g:863:4: (lv_y_4_0= RULE_INT )
            {
            // InternalMyDsl.g:863:4: (lv_y_4_0= RULE_INT )
            // InternalMyDsl.g:864:5: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_y_4_0, grammarAccess.getOriginAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:880:3: ( (lv_z_5_0= RULE_INT ) )
            // InternalMyDsl.g:881:4: (lv_z_5_0= RULE_INT )
            {
            // InternalMyDsl.g:881:4: (lv_z_5_0= RULE_INT )
            // InternalMyDsl.g:882:5: lv_z_5_0= RULE_INT
            {
            lv_z_5_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_z_5_0, grammarAccess.getOriginAccess().getZINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:898:3: (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:899:4: otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= RULE_INT ) ) ( (lv_pitch_8_0= RULE_INT ) ) ( (lv_yaw_9_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0());
                    			
                    // InternalMyDsl.g:903:4: ( (lv_roll_7_0= RULE_INT ) )
                    // InternalMyDsl.g:904:5: (lv_roll_7_0= RULE_INT )
                    {
                    // InternalMyDsl.g:904:5: (lv_roll_7_0= RULE_INT )
                    // InternalMyDsl.g:905:6: lv_roll_7_0= RULE_INT
                    {
                    lv_roll_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_roll_7_0, grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"roll",
                    							lv_roll_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:921:4: ( (lv_pitch_8_0= RULE_INT ) )
                    // InternalMyDsl.g:922:5: (lv_pitch_8_0= RULE_INT )
                    {
                    // InternalMyDsl.g:922:5: (lv_pitch_8_0= RULE_INT )
                    // InternalMyDsl.g:923:6: lv_pitch_8_0= RULE_INT
                    {
                    lv_pitch_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_pitch_8_0, grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pitch",
                    							lv_pitch_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:939:4: ( (lv_yaw_9_0= RULE_INT ) )
                    // InternalMyDsl.g:940:5: (lv_yaw_9_0= RULE_INT )
                    {
                    // InternalMyDsl.g:940:5: (lv_yaw_9_0= RULE_INT )
                    // InternalMyDsl.g:941:6: lv_yaw_9_0= RULE_INT
                    {
                    lv_yaw_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_yaw_9_0, grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"yaw",
                    							lv_yaw_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalMyDsl.g:962:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalMyDsl.g:962:45: (iv_ruleMass= ruleMass EOF )
            // InternalMyDsl.g:963:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalMyDsl.g:969:1: ruleMass returns [EObject current=null] : (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= RULE_INT ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_massValueInKilograms_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:975:2: ( (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:976:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:976:2: (otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:977:3: otherlv_0= 'Mass' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'massValueInKilograms' ( (lv_massValueInKilograms_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
            		
            // InternalMyDsl.g:981:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:982:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:982:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:983:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2());
            		
            // InternalMyDsl.g:1003:3: ( (lv_massValueInKilograms_3_0= RULE_INT ) )
            // InternalMyDsl.g:1004:4: (lv_massValueInKilograms_3_0= RULE_INT )
            {
            // InternalMyDsl.g:1004:4: (lv_massValueInKilograms_3_0= RULE_INT )
            // InternalMyDsl.g:1005:5: lv_massValueInKilograms_3_0= RULE_INT
            {
            lv_massValueInKilograms_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_massValueInKilograms_3_0, grammarAccess.getMassAccess().getMassValueInKilogramsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"massValueInKilograms",
            						lv_massValueInKilograms_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMass"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:1025:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1031:2: ( ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) ) )
            // InternalMyDsl.g:1032:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            {
            // InternalMyDsl.g:1032:2: ( (enumLiteral_0= 'Fixed' ) | (enumLiteral_1= 'Revolute' ) | (enumLiteral_2= 'Prismatic' ) | (enumLiteral_3= 'Continuous' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case 39:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1033:3: (enumLiteral_0= 'Fixed' )
                    {
                    // InternalMyDsl.g:1033:3: (enumLiteral_0= 'Fixed' )
                    // InternalMyDsl.g:1034:4: enumLiteral_0= 'Fixed'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1041:3: (enumLiteral_1= 'Revolute' )
                    {
                    // InternalMyDsl.g:1041:3: (enumLiteral_1= 'Revolute' )
                    // InternalMyDsl.g:1042:4: enumLiteral_1= 'Revolute'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1049:3: (enumLiteral_2= 'Prismatic' )
                    {
                    // InternalMyDsl.g:1049:3: (enumLiteral_2= 'Prismatic' )
                    // InternalMyDsl.g:1050:4: enumLiteral_2= 'Prismatic'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1057:3: (enumLiteral_3= 'Continuous' )
                    {
                    // InternalMyDsl.g:1057:3: (enumLiteral_3= 'Continuous' )
                    // InternalMyDsl.g:1058:4: enumLiteral_3= 'Continuous'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});

}