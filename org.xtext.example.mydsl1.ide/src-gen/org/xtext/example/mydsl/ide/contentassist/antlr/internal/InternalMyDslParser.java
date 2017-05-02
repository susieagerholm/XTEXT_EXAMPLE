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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'{'", "'}'", "':'", "','"
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__MethodsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__MethodsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__MethodsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__MethodsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__MethodsAssignment )*
            {
             before(grammarAccess.getModelAccess().getMethodsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__MethodsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__MethodsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MethodsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMethodsAssignment()); 

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


    // $ANTLR start "entryRuleMethod"
    // InternalMyDsl.g:78:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMethod EOF )
            // InternalMyDsl.g:80:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMyDsl.g:87:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Method__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Method__Group__0 )
            // InternalMyDsl.g:94:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDefinitionBlock"
    // InternalMyDsl.g:103:1: entryRuleDefinitionBlock : ruleDefinitionBlock EOF ;
    public final void entryRuleDefinitionBlock() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDefinitionBlock EOF )
            // InternalMyDsl.g:105:1: ruleDefinitionBlock EOF
            {
             before(grammarAccess.getDefinitionBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionBlock();

            state._fsp--;

             after(grammarAccess.getDefinitionBlockRule()); 
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
    // $ANTLR end "entryRuleDefinitionBlock"


    // $ANTLR start "ruleDefinitionBlock"
    // InternalMyDsl.g:112:1: ruleDefinitionBlock : ( ( rule__DefinitionBlock__Group__0 ) ) ;
    public final void ruleDefinitionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__DefinitionBlock__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__DefinitionBlock__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__DefinitionBlock__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__DefinitionBlock__Group__0 )
            {
             before(grammarAccess.getDefinitionBlockAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__DefinitionBlock__Group__0 )
            // InternalMyDsl.g:119:4: rule__DefinitionBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinitionBlock"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalMyDsl.g:128:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVariableDefinition EOF )
            // InternalMyDsl.g:130:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalMyDsl.g:137:1: ruleVariableDefinition : ( ( rule__VariableDefinition__NameAssignment ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__VariableDefinition__NameAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__VariableDefinition__NameAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__VariableDefinition__NameAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__VariableDefinition__NameAssignment )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__VariableDefinition__NameAssignment )
            // InternalMyDsl.g:144:4: rule__VariableDefinition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMyDsl.g:152:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMyDsl.g:157:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__Method__Group__0__Impl : ( 'def' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( 'def' ) )
            // InternalMyDsl.g:169:1: ( 'def' )
            {
            // InternalMyDsl.g:169:1: ( 'def' )
            // InternalMyDsl.g:170:2: 'def'
            {
             before(grammarAccess.getMethodAccess().getDefKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMyDsl.g:179:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMyDsl.g:184:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMyDsl.g:191:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:195:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalMyDsl.g:196:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:196:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalMyDsl.g:197:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:198:2: ( rule__Method__NameAssignment_1 )
            // InternalMyDsl.g:198:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMyDsl.g:206:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMyDsl.g:211:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMyDsl.g:218:1: rule__Method__Group__2__Impl : ( '{' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( '{' ) )
            // InternalMyDsl.g:223:1: ( '{' )
            {
            // InternalMyDsl.g:223:1: ( '{' )
            // InternalMyDsl.g:224:2: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMyDsl.g:233:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMyDsl.g:238:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMyDsl.g:245:1: rule__Method__Group__3__Impl : ( ( rule__Method__DefinitionBlocksAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:249:1: ( ( ( rule__Method__DefinitionBlocksAssignment_3 )* ) )
            // InternalMyDsl.g:250:1: ( ( rule__Method__DefinitionBlocksAssignment_3 )* )
            {
            // InternalMyDsl.g:250:1: ( ( rule__Method__DefinitionBlocksAssignment_3 )* )
            // InternalMyDsl.g:251:2: ( rule__Method__DefinitionBlocksAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getDefinitionBlocksAssignment_3()); 
            // InternalMyDsl.g:252:2: ( rule__Method__DefinitionBlocksAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:252:3: rule__Method__DefinitionBlocksAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Method__DefinitionBlocksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getDefinitionBlocksAssignment_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMyDsl.g:260:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Method__Group__4__Impl )
            // InternalMyDsl.g:265:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__4__Impl();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMyDsl.g:271:1: rule__Method__Group__4__Impl : ( '}' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( ( '}' ) )
            // InternalMyDsl.g:276:1: ( '}' )
            {
            // InternalMyDsl.g:276:1: ( '}' )
            // InternalMyDsl.g:277:2: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group__0"
    // InternalMyDsl.g:287:1: rule__DefinitionBlock__Group__0 : rule__DefinitionBlock__Group__0__Impl rule__DefinitionBlock__Group__1 ;
    public final void rule__DefinitionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__DefinitionBlock__Group__0__Impl rule__DefinitionBlock__Group__1 )
            // InternalMyDsl.g:292:2: rule__DefinitionBlock__Group__0__Impl rule__DefinitionBlock__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group__1();

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
    // $ANTLR end "rule__DefinitionBlock__Group__0"


    // $ANTLR start "rule__DefinitionBlock__Group__0__Impl"
    // InternalMyDsl.g:299:1: rule__DefinitionBlock__Group__0__Impl : ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 ) ) ;
    public final void rule__DefinitionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 ) ) )
            // InternalMyDsl.g:304:1: ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 ) )
            {
            // InternalMyDsl.g:304:1: ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 ) )
            // InternalMyDsl.g:305:2: ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 )
            {
             before(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsAssignment_0()); 
            // InternalMyDsl.g:306:2: ( rule__DefinitionBlock__VariableDefinitionsAssignment_0 )
            // InternalMyDsl.g:306:3: rule__DefinitionBlock__VariableDefinitionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__VariableDefinitionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsAssignment_0()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group__0__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group__1"
    // InternalMyDsl.g:314:1: rule__DefinitionBlock__Group__1 : rule__DefinitionBlock__Group__1__Impl rule__DefinitionBlock__Group__2 ;
    public final void rule__DefinitionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__DefinitionBlock__Group__1__Impl rule__DefinitionBlock__Group__2 )
            // InternalMyDsl.g:319:2: rule__DefinitionBlock__Group__1__Impl rule__DefinitionBlock__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group__2();

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
    // $ANTLR end "rule__DefinitionBlock__Group__1"


    // $ANTLR start "rule__DefinitionBlock__Group__1__Impl"
    // InternalMyDsl.g:326:1: rule__DefinitionBlock__Group__1__Impl : ( ( rule__DefinitionBlock__Group_1__0 )* ) ;
    public final void rule__DefinitionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( ( rule__DefinitionBlock__Group_1__0 )* ) )
            // InternalMyDsl.g:331:1: ( ( rule__DefinitionBlock__Group_1__0 )* )
            {
            // InternalMyDsl.g:331:1: ( ( rule__DefinitionBlock__Group_1__0 )* )
            // InternalMyDsl.g:332:2: ( rule__DefinitionBlock__Group_1__0 )*
            {
             before(grammarAccess.getDefinitionBlockAccess().getGroup_1()); 
            // InternalMyDsl.g:333:2: ( rule__DefinitionBlock__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:333:3: rule__DefinitionBlock__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DefinitionBlock__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDefinitionBlockAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group__1__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group__2"
    // InternalMyDsl.g:341:1: rule__DefinitionBlock__Group__2 : rule__DefinitionBlock__Group__2__Impl rule__DefinitionBlock__Group__3 ;
    public final void rule__DefinitionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__DefinitionBlock__Group__2__Impl rule__DefinitionBlock__Group__3 )
            // InternalMyDsl.g:346:2: rule__DefinitionBlock__Group__2__Impl rule__DefinitionBlock__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DefinitionBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group__3();

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
    // $ANTLR end "rule__DefinitionBlock__Group__2"


    // $ANTLR start "rule__DefinitionBlock__Group__2__Impl"
    // InternalMyDsl.g:353:1: rule__DefinitionBlock__Group__2__Impl : ( ':' ) ;
    public final void rule__DefinitionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ':' ) )
            // InternalMyDsl.g:358:1: ( ':' )
            {
            // InternalMyDsl.g:358:1: ( ':' )
            // InternalMyDsl.g:359:2: ':'
            {
             before(grammarAccess.getDefinitionBlockAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefinitionBlockAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group__2__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group__3"
    // InternalMyDsl.g:368:1: rule__DefinitionBlock__Group__3 : rule__DefinitionBlock__Group__3__Impl ;
    public final void rule__DefinitionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__DefinitionBlock__Group__3__Impl )
            // InternalMyDsl.g:373:2: rule__DefinitionBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group__3__Impl();

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
    // $ANTLR end "rule__DefinitionBlock__Group__3"


    // $ANTLR start "rule__DefinitionBlock__Group__3__Impl"
    // InternalMyDsl.g:379:1: rule__DefinitionBlock__Group__3__Impl : ( ( rule__DefinitionBlock__TypeAssignment_3 ) ) ;
    public final void rule__DefinitionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( ( rule__DefinitionBlock__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:384:1: ( ( rule__DefinitionBlock__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:384:1: ( ( rule__DefinitionBlock__TypeAssignment_3 ) )
            // InternalMyDsl.g:385:2: ( rule__DefinitionBlock__TypeAssignment_3 )
            {
             before(grammarAccess.getDefinitionBlockAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:386:2: ( rule__DefinitionBlock__TypeAssignment_3 )
            // InternalMyDsl.g:386:3: rule__DefinitionBlock__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionBlockAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group__3__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group_1__0"
    // InternalMyDsl.g:395:1: rule__DefinitionBlock__Group_1__0 : rule__DefinitionBlock__Group_1__0__Impl rule__DefinitionBlock__Group_1__1 ;
    public final void rule__DefinitionBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__DefinitionBlock__Group_1__0__Impl rule__DefinitionBlock__Group_1__1 )
            // InternalMyDsl.g:400:2: rule__DefinitionBlock__Group_1__0__Impl rule__DefinitionBlock__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__DefinitionBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group_1__1();

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
    // $ANTLR end "rule__DefinitionBlock__Group_1__0"


    // $ANTLR start "rule__DefinitionBlock__Group_1__0__Impl"
    // InternalMyDsl.g:407:1: rule__DefinitionBlock__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DefinitionBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( ',' ) )
            // InternalMyDsl.g:412:1: ( ',' )
            {
            // InternalMyDsl.g:412:1: ( ',' )
            // InternalMyDsl.g:413:2: ','
            {
             before(grammarAccess.getDefinitionBlockAccess().getCommaKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionBlockAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group_1__0__Impl"


    // $ANTLR start "rule__DefinitionBlock__Group_1__1"
    // InternalMyDsl.g:422:1: rule__DefinitionBlock__Group_1__1 : rule__DefinitionBlock__Group_1__1__Impl ;
    public final void rule__DefinitionBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__DefinitionBlock__Group_1__1__Impl )
            // InternalMyDsl.g:427:2: rule__DefinitionBlock__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__Group_1__1__Impl();

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
    // $ANTLR end "rule__DefinitionBlock__Group_1__1"


    // $ANTLR start "rule__DefinitionBlock__Group_1__1__Impl"
    // InternalMyDsl.g:433:1: rule__DefinitionBlock__Group_1__1__Impl : ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 ) ) ;
    public final void rule__DefinitionBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 ) ) )
            // InternalMyDsl.g:438:1: ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:438:1: ( ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 ) )
            // InternalMyDsl.g:439:2: ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 )
            {
             before(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsAssignment_1_1()); 
            // InternalMyDsl.g:440:2: ( rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 )
            // InternalMyDsl.g:440:3: rule__DefinitionBlock__VariableDefinitionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionBlock__VariableDefinitionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsAssignment_1_1()); 

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
    // $ANTLR end "rule__DefinitionBlock__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MethodsAssignment"
    // InternalMyDsl.g:449:1: rule__Model__MethodsAssignment : ( ruleMethod ) ;
    public final void rule__Model__MethodsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( ruleMethod ) )
            // InternalMyDsl.g:454:2: ( ruleMethod )
            {
            // InternalMyDsl.g:454:2: ( ruleMethod )
            // InternalMyDsl.g:455:3: ruleMethod
            {
             before(grammarAccess.getModelAccess().getMethodsMethodParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMethodsMethodParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__MethodsAssignment"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalMyDsl.g:464:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:469:2: ( RULE_ID )
            {
            // InternalMyDsl.g:469:2: ( RULE_ID )
            // InternalMyDsl.g:470:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__DefinitionBlocksAssignment_3"
    // InternalMyDsl.g:479:1: rule__Method__DefinitionBlocksAssignment_3 : ( ruleDefinitionBlock ) ;
    public final void rule__Method__DefinitionBlocksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( ( ruleDefinitionBlock ) )
            // InternalMyDsl.g:484:2: ( ruleDefinitionBlock )
            {
            // InternalMyDsl.g:484:2: ( ruleDefinitionBlock )
            // InternalMyDsl.g:485:3: ruleDefinitionBlock
            {
             before(grammarAccess.getMethodAccess().getDefinitionBlocksDefinitionBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionBlock();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getDefinitionBlocksDefinitionBlockParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Method__DefinitionBlocksAssignment_3"


    // $ANTLR start "rule__DefinitionBlock__VariableDefinitionsAssignment_0"
    // InternalMyDsl.g:494:1: rule__DefinitionBlock__VariableDefinitionsAssignment_0 : ( ruleVariableDefinition ) ;
    public final void rule__DefinitionBlock__VariableDefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ruleVariableDefinition ) )
            // InternalMyDsl.g:499:2: ( ruleVariableDefinition )
            {
            // InternalMyDsl.g:499:2: ( ruleVariableDefinition )
            // InternalMyDsl.g:500:3: ruleVariableDefinition
            {
             before(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefinitionBlock__VariableDefinitionsAssignment_0"


    // $ANTLR start "rule__DefinitionBlock__VariableDefinitionsAssignment_1_1"
    // InternalMyDsl.g:509:1: rule__DefinitionBlock__VariableDefinitionsAssignment_1_1 : ( ruleVariableDefinition ) ;
    public final void rule__DefinitionBlock__VariableDefinitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( ruleVariableDefinition ) )
            // InternalMyDsl.g:514:2: ( ruleVariableDefinition )
            {
            // InternalMyDsl.g:514:2: ( ruleVariableDefinition )
            // InternalMyDsl.g:515:3: ruleVariableDefinition
            {
             before(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionBlockAccess().getVariableDefinitionsVariableDefinitionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DefinitionBlock__VariableDefinitionsAssignment_1_1"


    // $ANTLR start "rule__DefinitionBlock__TypeAssignment_3"
    // InternalMyDsl.g:524:1: rule__DefinitionBlock__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__DefinitionBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:529:2: ( RULE_ID )
            {
            // InternalMyDsl.g:529:2: ( RULE_ID )
            // InternalMyDsl.g:530:3: RULE_ID
            {
             before(grammarAccess.getDefinitionBlockAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionBlockAccess().getTypeIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DefinitionBlock__TypeAssignment_3"


    // $ANTLR start "rule__VariableDefinition__NameAssignment"
    // InternalMyDsl.g:539:1: rule__VariableDefinition__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:544:2: ( RULE_ID )
            {
            // InternalMyDsl.g:544:2: ( RULE_ID )
            // InternalMyDsl.g:545:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VariableDefinition__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});

}