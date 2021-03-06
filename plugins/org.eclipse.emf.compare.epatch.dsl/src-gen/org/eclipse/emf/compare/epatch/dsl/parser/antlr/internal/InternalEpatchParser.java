package org.eclipse.emf.compare.epatch.dsl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.emf.compare.epatch.dsl.services.EpatchGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEpatchParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FRAGMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'epatch'", "'{'", "'}'", "'import'", "'uri'", "'ns'", "'resource'", "'left'", "';'", "'right'", "'object'", "'='", "'|'", "'['", "','", "']'", "'.'", "':'", "'null'", "'new'", "'copy'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int EOF=-1;
    public static final int RULE_INT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_FRAGMENT=6;

        public InternalEpatchParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g"; }


     
     	private EpatchGrammarAccess grammarAccess;
     	
        public InternalEpatchParser(TokenStream input, IAstFactory factory, EpatchGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Epatch";	
       	} 



    // $ANTLR start entryRuleEpatch
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:70:1: entryRuleEpatch returns [EObject current=null] : iv_ruleEpatch= ruleEpatch EOF ;
    public final EObject entryRuleEpatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEpatch = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:70:48: (iv_ruleEpatch= ruleEpatch EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:71:2: iv_ruleEpatch= ruleEpatch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEpatchRule(), currentNode); 
            pushFollow(FOLLOW_ruleEpatch_in_entryRuleEpatch73);
            iv_ruleEpatch=ruleEpatch();
            _fsp--;

             current =iv_ruleEpatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEpatch83); 

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
    // $ANTLR end entryRuleEpatch


    // $ANTLR start ruleEpatch
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:78:1: ruleEpatch returns [EObject current=null] : ( 'epatch' (lv_name_1= RULE_ID ) '{' (lv_modelImports_3= ruleModelImport )* (lv_resources_4= ruleNamedResource )* (lv_objects_5= ruleObjectRef )* '}' ) ;
    public final EObject ruleEpatch() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_modelImports_3 = null;

        EObject lv_resources_4 = null;

        EObject lv_objects_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:83:6: ( ( 'epatch' (lv_name_1= RULE_ID ) '{' (lv_modelImports_3= ruleModelImport )* (lv_resources_4= ruleNamedResource )* (lv_objects_5= ruleObjectRef )* '}' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:84:1: ( 'epatch' (lv_name_1= RULE_ID ) '{' (lv_modelImports_3= ruleModelImport )* (lv_resources_4= ruleNamedResource )* (lv_objects_5= ruleObjectRef )* '}' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:84:1: ( 'epatch' (lv_name_1= RULE_ID ) '{' (lv_modelImports_3= ruleModelImport )* (lv_resources_4= ruleNamedResource )* (lv_objects_5= ruleObjectRef )* '}' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:84:2: 'epatch' (lv_name_1= RULE_ID ) '{' (lv_modelImports_3= ruleModelImport )* (lv_resources_4= ruleNamedResource )* (lv_objects_5= ruleObjectRef )* '}'
            {
            match(input,12,FOLLOW_12_in_ruleEpatch117); 

                    createLeafNode(grammarAccess.getEpatchAccess().getEpatchKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:88:1: (lv_name_1= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:90:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEpatch139); 

            		createLeafNode(grammarAccess.getEpatchAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEpatchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleEpatch156); 

                    createLeafNode(grammarAccess.getEpatchAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:112:1: (lv_modelImports_3= ruleModelImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:115:6: lv_modelImports_3= ruleModelImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEpatchAccess().getModelImportsModelImportParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelImport_in_ruleEpatch190);
            	    lv_modelImports_3=ruleModelImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEpatchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "modelImports", lv_modelImports_3, "ModelImport", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:133:3: (lv_resources_4= ruleNamedResource )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:136:6: lv_resources_4= ruleNamedResource
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEpatchAccess().getResourcesNamedResourceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedResource_in_ruleEpatch229);
            	    lv_resources_4=ruleNamedResource();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEpatchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "resources", lv_resources_4, "NamedResource", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:154:3: (lv_objects_5= ruleObjectRef )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:157:6: lv_objects_5= ruleObjectRef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEpatchAccess().getObjectsObjectRefParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjectRef_in_ruleEpatch268);
            	    lv_objects_5=ruleObjectRef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEpatchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "objects", lv_objects_5, "ObjectRef", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleEpatch282); 

                    createLeafNode(grammarAccess.getEpatchAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEpatch


    // $ANTLR start entryRuleModelImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:186:1: entryRuleModelImport returns [EObject current=null] : iv_ruleModelImport= ruleModelImport EOF ;
    public final EObject entryRuleModelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelImport = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:186:53: (iv_ruleModelImport= ruleModelImport EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:187:2: iv_ruleModelImport= ruleModelImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelImport_in_entryRuleModelImport315);
            iv_ruleModelImport=ruleModelImport();
            _fsp--;

             current =iv_ruleModelImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelImport325); 

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
    // $ANTLR end entryRuleModelImport


    // $ANTLR start ruleModelImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:194:1: ruleModelImport returns [EObject current=null] : (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport ) ;
    public final EObject ruleModelImport() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceImport_0 = null;

        EObject this_EPackageImport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:199:6: ( (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:200:1: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:200:1: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==16) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==17) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("200:1: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("200:1: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("200:1: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:201:5: this_ResourceImport_0= ruleResourceImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelImportAccess().getResourceImportParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResourceImport_in_ruleModelImport372);
                    this_ResourceImport_0=ruleResourceImport();
                    _fsp--;

                     
                            current = this_ResourceImport_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:211:5: this_EPackageImport_1= ruleEPackageImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelImportAccess().getEPackageImportParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEPackageImport_in_ruleModelImport399);
                    this_EPackageImport_1=ruleEPackageImport();
                    _fsp--;

                     
                            current = this_EPackageImport_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelImport


    // $ANTLR start entryRuleResourceImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:226:1: entryRuleResourceImport returns [EObject current=null] : iv_ruleResourceImport= ruleResourceImport EOF ;
    public final EObject entryRuleResourceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceImport = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:226:56: (iv_ruleResourceImport= ruleResourceImport EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:227:2: iv_ruleResourceImport= ruleResourceImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceImport_in_entryRuleResourceImport431);
            iv_ruleResourceImport=ruleResourceImport();
            _fsp--;

             current =iv_ruleResourceImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceImport441); 

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
    // $ANTLR end entryRuleResourceImport


    // $ANTLR start ruleResourceImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:234:1: ruleResourceImport returns [EObject current=null] : ( 'import' (lv_name_1= RULE_ID ) 'uri' (lv_uri_3= RULE_STRING ) ) ;
    public final EObject ruleResourceImport() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_uri_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:239:6: ( ( 'import' (lv_name_1= RULE_ID ) 'uri' (lv_uri_3= RULE_STRING ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:240:1: ( 'import' (lv_name_1= RULE_ID ) 'uri' (lv_uri_3= RULE_STRING ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:240:1: ( 'import' (lv_name_1= RULE_ID ) 'uri' (lv_uri_3= RULE_STRING ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:240:2: 'import' (lv_name_1= RULE_ID ) 'uri' (lv_uri_3= RULE_STRING )
            {
            match(input,15,FOLLOW_15_in_ruleResourceImport475); 

                    createLeafNode(grammarAccess.getResourceImportAccess().getImportKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:244:1: (lv_name_1= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:246:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceImport497); 

            		createLeafNode(grammarAccess.getResourceImportAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleResourceImport514); 

                    createLeafNode(grammarAccess.getResourceImportAccess().getUriKeyword_2(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:268:1: (lv_uri_3= RULE_STRING )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:270:6: lv_uri_3= RULE_STRING
            {
            lv_uri_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceImport536); 

            		createLeafNode(grammarAccess.getResourceImportAccess().getUriSTRINGTerminalRuleCall_3_0(), "uri"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "uri", lv_uri_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResourceImport


    // $ANTLR start entryRuleEPackageImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:295:1: entryRuleEPackageImport returns [EObject current=null] : iv_ruleEPackageImport= ruleEPackageImport EOF ;
    public final EObject entryRuleEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageImport = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:295:56: (iv_ruleEPackageImport= ruleEPackageImport EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:296:2: iv_ruleEPackageImport= ruleEPackageImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEPackageImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleEPackageImport_in_entryRuleEPackageImport577);
            iv_ruleEPackageImport=ruleEPackageImport();
            _fsp--;

             current =iv_ruleEPackageImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPackageImport587); 

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
    // $ANTLR end entryRuleEPackageImport


    // $ANTLR start ruleEPackageImport
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:303:1: ruleEPackageImport returns [EObject current=null] : ( 'import' (lv_name_1= RULE_ID ) 'ns' (lv_nsURI_3= RULE_STRING ) ) ;
    public final EObject ruleEPackageImport() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_nsURI_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:308:6: ( ( 'import' (lv_name_1= RULE_ID ) 'ns' (lv_nsURI_3= RULE_STRING ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:309:1: ( 'import' (lv_name_1= RULE_ID ) 'ns' (lv_nsURI_3= RULE_STRING ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:309:1: ( 'import' (lv_name_1= RULE_ID ) 'ns' (lv_nsURI_3= RULE_STRING ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:309:2: 'import' (lv_name_1= RULE_ID ) 'ns' (lv_nsURI_3= RULE_STRING )
            {
            match(input,15,FOLLOW_15_in_ruleEPackageImport621); 

                    createLeafNode(grammarAccess.getEPackageImportAccess().getImportKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:313:1: (lv_name_1= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:315:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEPackageImport643); 

            		createLeafNode(grammarAccess.getEPackageImportAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEPackageImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleEPackageImport660); 

                    createLeafNode(grammarAccess.getEPackageImportAccess().getNsKeyword_2(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:337:1: (lv_nsURI_3= RULE_STRING )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:339:6: lv_nsURI_3= RULE_STRING
            {
            lv_nsURI_3=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEPackageImport682); 

            		createLeafNode(grammarAccess.getEPackageImportAccess().getNsURISTRINGTerminalRuleCall_3_0(), "nsURI"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEPackageImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "nsURI", lv_nsURI_3, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEPackageImport


    // $ANTLR start entryRuleNamedResource
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:364:1: entryRuleNamedResource returns [EObject current=null] : iv_ruleNamedResource= ruleNamedResource EOF ;
    public final EObject entryRuleNamedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedResource = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:364:55: (iv_ruleNamedResource= ruleNamedResource EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:365:2: iv_ruleNamedResource= ruleNamedResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNamedResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNamedResource_in_entryRuleNamedResource723);
            iv_ruleNamedResource=ruleNamedResource();
            _fsp--;

             current =iv_ruleNamedResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedResource733); 

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
    // $ANTLR end entryRuleNamedResource


    // $ANTLR start ruleNamedResource
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:372:1: ruleNamedResource returns [EObject current=null] : ( 'resource' (lv_name_1= RULE_ID ) '{' 'left' ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) ) ';' 'right' ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) ) ';' '}' ) ;
    public final EObject ruleNamedResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_leftUri_5=null;
        Token lv_rightUri_10=null;
        EObject lv_leftRoot_6 = null;

        EObject lv_rightRoot_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:377:6: ( ( 'resource' (lv_name_1= RULE_ID ) '{' 'left' ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) ) ';' 'right' ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) ) ';' '}' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:378:1: ( 'resource' (lv_name_1= RULE_ID ) '{' 'left' ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) ) ';' 'right' ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) ) ';' '}' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:378:1: ( 'resource' (lv_name_1= RULE_ID ) '{' 'left' ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) ) ';' 'right' ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) ) ';' '}' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:378:2: 'resource' (lv_name_1= RULE_ID ) '{' 'left' ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) ) ';' 'right' ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) ) ';' '}'
            {
            match(input,18,FOLLOW_18_in_ruleNamedResource767); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getResourceKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:382:1: (lv_name_1= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:384:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedResource789); 

            		createLeafNode(grammarAccess.getNamedResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNamedResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleNamedResource806); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,19,FOLLOW_19_in_ruleNamedResource815); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getLeftKeyword_3(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:410:1: ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=31 && LA5_0<=32)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("410:1: ( ( 'uri' (lv_leftUri_5= RULE_STRING ) ) | (lv_leftRoot_6= ruleCreatedObject ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:410:2: ( 'uri' (lv_leftUri_5= RULE_STRING ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:410:2: ( 'uri' (lv_leftUri_5= RULE_STRING ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:410:3: 'uri' (lv_leftUri_5= RULE_STRING )
                    {
                    match(input,16,FOLLOW_16_in_ruleNamedResource826); 

                            createLeafNode(grammarAccess.getNamedResourceAccess().getUriKeyword_4_0_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:414:1: (lv_leftUri_5= RULE_STRING )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:416:6: lv_leftUri_5= RULE_STRING
                    {
                    lv_leftUri_5=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNamedResource848); 

                    		createLeafNode(grammarAccess.getNamedResourceAccess().getLeftUriSTRINGTerminalRuleCall_4_0_1_0(), "leftUri"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedResourceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "leftUri", lv_leftUri_5, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:435:6: (lv_leftRoot_6= ruleCreatedObject )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:435:6: (lv_leftRoot_6= ruleCreatedObject )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:438:6: lv_leftRoot_6= ruleCreatedObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedResourceAccess().getLeftRootCreatedObjectParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCreatedObject_in_ruleNamedResource897);
                    lv_leftRoot_6=ruleCreatedObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedResourceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "leftRoot", lv_leftRoot_6, "CreatedObject", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleNamedResource911); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getSemicolonKeyword_5(), null); 
                
            match(input,21,FOLLOW_21_in_ruleNamedResource920); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getRightKeyword_6(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:464:1: ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=31 && LA6_0<=32)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("464:1: ( ( 'uri' (lv_rightUri_10= RULE_STRING ) ) | (lv_rightRoot_11= ruleCreatedObject ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:464:2: ( 'uri' (lv_rightUri_10= RULE_STRING ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:464:2: ( 'uri' (lv_rightUri_10= RULE_STRING ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:464:3: 'uri' (lv_rightUri_10= RULE_STRING )
                    {
                    match(input,16,FOLLOW_16_in_ruleNamedResource931); 

                            createLeafNode(grammarAccess.getNamedResourceAccess().getUriKeyword_7_0_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:468:1: (lv_rightUri_10= RULE_STRING )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:470:6: lv_rightUri_10= RULE_STRING
                    {
                    lv_rightUri_10=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNamedResource953); 

                    		createLeafNode(grammarAccess.getNamedResourceAccess().getRightUriSTRINGTerminalRuleCall_7_0_1_0(), "rightUri"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedResourceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "rightUri", lv_rightUri_10, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:489:6: (lv_rightRoot_11= ruleCreatedObject )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:489:6: (lv_rightRoot_11= ruleCreatedObject )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:492:6: lv_rightRoot_11= ruleCreatedObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedResourceAccess().getRightRootCreatedObjectParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCreatedObject_in_ruleNamedResource1002);
                    lv_rightRoot_11=ruleCreatedObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedResourceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "rightRoot", lv_rightRoot_11, "CreatedObject", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleNamedResource1016); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getSemicolonKeyword_8(), null); 
                
            match(input,14,FOLLOW_14_in_ruleNamedResource1025); 

                    createLeafNode(grammarAccess.getNamedResourceAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNamedResource


    // $ANTLR start entryRuleObjectRef
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:527:1: entryRuleObjectRef returns [EObject current=null] : iv_ruleObjectRef= ruleObjectRef EOF ;
    public final EObject entryRuleObjectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectRef = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:527:51: (iv_ruleObjectRef= ruleObjectRef EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:528:2: iv_ruleObjectRef= ruleObjectRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectRef_in_entryRuleObjectRef1060);
            iv_ruleObjectRef=ruleObjectRef();
            _fsp--;

             current =iv_ruleObjectRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectRef1070); 

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
    // $ANTLR end entryRuleObjectRef


    // $ANTLR start ruleObjectRef
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:535:1: ruleObjectRef returns [EObject current=null] : ( 'object' (lv_name_1= RULE_ID )? ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) ) ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )? ) ;
    public final EObject ruleObjectRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_leftFrag_3=null;
        Token lv_leftFrag_6=null;
        Token lv_rightFrag_9=null;
        EObject lv_assignments_11 = null;

        EObject lv_assignments_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:540:6: ( ( 'object' (lv_name_1= RULE_ID )? ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) ) ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )? ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:541:1: ( 'object' (lv_name_1= RULE_ID )? ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) ) ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )? )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:541:1: ( 'object' (lv_name_1= RULE_ID )? ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) ) ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )? )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:541:2: 'object' (lv_name_1= RULE_ID )? ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) ) ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )?
            {
            match(input,22,FOLLOW_22_in_ruleObjectRef1104); 

                    createLeafNode(grammarAccess.getObjectRefAccess().getObjectKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:545:1: (lv_name_1= RULE_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID||LA7_1==19) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:547:6: lv_name_1= RULE_ID
                    {
                    lv_name_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRef1126); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:565:3: ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("565:3: ( ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) ) | ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:565:4: ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:565:4: ( ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:565:5: ( RULE_ID ) (lv_leftFrag_3= RULE_FRAGMENT )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:565:5: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:568:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRef1159); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_0_0_0(), "leftRes"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:581:2: (lv_leftFrag_3= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:583:6: lv_leftFrag_3= RULE_FRAGMENT
                    {
                    lv_leftFrag_3=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1184); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_0_1_0(), "leftFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "leftFrag", lv_leftFrag_3, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:602:6: ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:602:6: ( 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:602:7: 'left' ( RULE_ID ) (lv_leftFrag_6= RULE_FRAGMENT ) 'right' ( RULE_ID ) (lv_rightFrag_9= RULE_FRAGMENT )
                    {
                    match(input,19,FOLLOW_19_in_ruleObjectRef1209); 

                            createLeafNode(grammarAccess.getObjectRefAccess().getLeftKeyword_2_1_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:606:1: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:609:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRef1231); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_1_1_0(), "leftRes"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:622:2: (lv_leftFrag_6= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:624:6: lv_leftFrag_6= RULE_FRAGMENT
                    {
                    lv_leftFrag_6=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1256); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_1_2_0(), "leftFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "leftFrag", lv_leftFrag_6, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,21,FOLLOW_21_in_ruleObjectRef1273); 

                            createLeafNode(grammarAccess.getObjectRefAccess().getRightKeyword_2_1_3(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:646:1: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:649:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRef1295); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getRightResNamedResourceCrossReference_2_1_4_0(), "rightRes"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:662:2: (lv_rightFrag_9= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:664:6: lv_rightFrag_9= RULE_FRAGMENT
                    {
                    lv_rightFrag_9=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1320); 

                    		createLeafNode(grammarAccess.getObjectRefAccess().getRightFragFRAGMENTTerminalRuleCall_2_1_5_0(), "rightFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "rightFrag", lv_rightFrag_9, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:682:4: ( '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:682:5: '{' ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleObjectRef1340); 

                            createLeafNode(grammarAccess.getObjectRefAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:686:1: ( (lv_assignments_11= ruleBiSingleAssignment ) | (lv_assignments_12= ruleBiListAssignment ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==23) ) {
                                int LA9_3 = input.LA(3);

                                if ( (LA9_3==25) ) {
                                    alt9=2;
                                }
                                else if ( ((LA9_3>=RULE_ID && LA9_3<=RULE_STRING)||(LA9_3>=30 && LA9_3<=32)) ) {
                                    alt9=1;
                                }


                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:686:2: (lv_assignments_11= ruleBiSingleAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:686:2: (lv_assignments_11= ruleBiSingleAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:689:6: lv_assignments_11= ruleBiSingleAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBiSingleAssignment_in_ruleObjectRef1375);
                    	    lv_assignments_11=ruleBiSingleAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_11, "BiSingleAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:708:6: (lv_assignments_12= ruleBiListAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:708:6: (lv_assignments_12= ruleBiListAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:711:6: lv_assignments_12= ruleBiListAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiListAssignmentParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBiListAssignment_in_ruleObjectRef1419);
                    	    lv_assignments_12=ruleBiListAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectRefRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_12, "BiListAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,14,FOLLOW_14_in_ruleObjectRef1434); 

                            createLeafNode(grammarAccess.getObjectRefAccess().getRightCurlyBracketKeyword_3_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObjectRef


    // $ANTLR start entryRuleCreatedObject
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:740:1: entryRuleCreatedObject returns [EObject current=null] : iv_ruleCreatedObject= ruleCreatedObject EOF ;
    public final EObject entryRuleCreatedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreatedObject = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:740:55: (iv_ruleCreatedObject= ruleCreatedObject EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:741:2: iv_ruleCreatedObject= ruleCreatedObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCreatedObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleCreatedObject_in_entryRuleCreatedObject1469);
            iv_ruleCreatedObject=ruleCreatedObject();
            _fsp--;

             current =iv_ruleCreatedObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreatedObject1479); 

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
    // $ANTLR end entryRuleCreatedObject


    // $ANTLR start ruleCreatedObject
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:748:1: ruleCreatedObject returns [EObject current=null] : (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ;
    public final EObject ruleCreatedObject() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectNew_0 = null;

        EObject this_ObjectCopy_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:753:6: ( (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:754:1: (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:754:1: (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("754:1: (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:755:5: this_ObjectNew_0= ruleObjectNew
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectNewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectNew_in_ruleCreatedObject1526);
                    this_ObjectNew_0=ruleObjectNew();
                    _fsp--;

                     
                            current = this_ObjectNew_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:765:5: this_ObjectCopy_1= ruleObjectCopy
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectCopyParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleObjectCopy_in_ruleCreatedObject1553);
                    this_ObjectCopy_1=ruleObjectCopy();
                    _fsp--;

                     
                            current = this_ObjectCopy_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCreatedObject


    // $ANTLR start entryRuleBiSingleAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:782:1: entryRuleBiSingleAssignment returns [EObject current=null] : iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF ;
    public final EObject entryRuleBiSingleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiSingleAssignment = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:782:60: (iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:783:2: iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBiSingleAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBiSingleAssignment_in_entryRuleBiSingleAssignment1587);
            iv_ruleBiSingleAssignment=ruleBiSingleAssignment();
            _fsp--;

             current =iv_ruleBiSingleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiSingleAssignment1597); 

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
    // $ANTLR end entryRuleBiSingleAssignment


    // $ANTLR start ruleBiSingleAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:790:1: ruleBiSingleAssignment returns [EObject current=null] : ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) '|' (lv_rightValue_4= ruleSingleAssignmentValue ) ';' ) ;
    public final EObject ruleBiSingleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0=null;
        EObject lv_leftValue_2 = null;

        EObject lv_rightValue_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:795:6: ( ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) '|' (lv_rightValue_4= ruleSingleAssignmentValue ) ';' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:796:1: ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) '|' (lv_rightValue_4= ruleSingleAssignmentValue ) ';' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:796:1: ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) '|' (lv_rightValue_4= ruleSingleAssignmentValue ) ';' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:796:2: (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) '|' (lv_rightValue_4= ruleSingleAssignmentValue ) ';'
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:796:2: (lv_feature_0= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:798:6: lv_feature_0= RULE_ID
            {
            lv_feature_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBiSingleAssignment1644); 

            		createLeafNode(grammarAccess.getBiSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0(), "feature"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBiSingleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "feature", lv_feature_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,23,FOLLOW_23_in_ruleBiSingleAssignment1661); 

                    createLeafNode(grammarAccess.getBiSingleAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:820:1: (lv_leftValue_2= ruleSingleAssignmentValue )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:823:6: lv_leftValue_2= ruleSingleAssignmentValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSingleAssignmentValue_in_ruleBiSingleAssignment1695);
            lv_leftValue_2=ruleSingleAssignmentValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBiSingleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "leftValue", lv_leftValue_2, "SingleAssignmentValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,24,FOLLOW_24_in_ruleBiSingleAssignment1708); 

                    createLeafNode(grammarAccess.getBiSingleAssignmentAccess().getVerticalLineKeyword_3(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:845:1: (lv_rightValue_4= ruleSingleAssignmentValue )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:848:6: lv_rightValue_4= ruleSingleAssignmentValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getRightValueSingleAssignmentValueParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSingleAssignmentValue_in_ruleBiSingleAssignment1742);
            lv_rightValue_4=ruleSingleAssignmentValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBiSingleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "rightValue", lv_rightValue_4, "SingleAssignmentValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,20,FOLLOW_20_in_ruleBiSingleAssignment1755); 

                    createLeafNode(grammarAccess.getBiSingleAssignmentAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBiSingleAssignment


    // $ANTLR start entryRuleBiListAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:877:1: entryRuleBiListAssignment returns [EObject current=null] : iv_ruleBiListAssignment= ruleBiListAssignment EOF ;
    public final EObject entryRuleBiListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiListAssignment = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:877:58: (iv_ruleBiListAssignment= ruleBiListAssignment EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:878:2: iv_ruleBiListAssignment= ruleBiListAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBiListAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleBiListAssignment_in_entryRuleBiListAssignment1788);
            iv_ruleBiListAssignment=ruleBiListAssignment();
            _fsp--;

             current =iv_ruleBiListAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBiListAssignment1798); 

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
    // $ANTLR end entryRuleBiListAssignment


    // $ANTLR start ruleBiListAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:885:1: ruleBiListAssignment returns [EObject current=null] : ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )? '|' ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )? ']' ';' ) ;
    public final EObject ruleBiListAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0=null;
        EObject lv_leftValues_3 = null;

        EObject lv_leftValues_5 = null;

        EObject lv_rightValues_7 = null;

        EObject lv_rightValues_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:890:6: ( ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )? '|' ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )? ']' ';' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:891:1: ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )? '|' ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )? ']' ';' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:891:1: ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )? '|' ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )? ']' ';' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:891:2: (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )? '|' ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )? ']' ';'
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:891:2: (lv_feature_0= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:893:6: lv_feature_0= RULE_ID
            {
            lv_feature_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBiListAssignment1845); 

            		createLeafNode(grammarAccess.getBiListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0(), "feature"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBiListAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "feature", lv_feature_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,23,FOLLOW_23_in_ruleBiListAssignment1862); 

                    createLeafNode(grammarAccess.getBiListAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleBiListAssignment1871); 

                    createLeafNode(grammarAccess.getBiListAssignmentAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:919:1: ( (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:919:2: (lv_leftValues_3= ruleListAssignmentValue ) ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )*
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:919:2: (lv_leftValues_3= ruleListAssignmentValue )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:922:6: lv_leftValues_3= ruleListAssignmentValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment1906);
                    lv_leftValues_3=ruleListAssignmentValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBiListAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "leftValues", lv_leftValues_3, "ListAssignmentValue", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:940:2: ( ',' (lv_leftValues_5= ruleListAssignmentValue ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==26) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:940:3: ',' (lv_leftValues_5= ruleListAssignmentValue )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleBiListAssignment1920); 

                    	            createLeafNode(grammarAccess.getBiListAssignmentAccess().getCommaKeyword_3_1_0(), null); 
                    	        
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:944:1: (lv_leftValues_5= ruleListAssignmentValue )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:947:6: lv_leftValues_5= ruleListAssignmentValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment1954);
                    	    lv_leftValues_5=ruleListAssignmentValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBiListAssignmentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "leftValues", lv_leftValues_5, "ListAssignmentValue", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ruleBiListAssignment1971); 

                    createLeafNode(grammarAccess.getBiListAssignmentAccess().getVerticalLineKeyword_4(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:969:1: ( (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:969:2: (lv_rightValues_7= ruleListAssignmentValue ) ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )*
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:969:2: (lv_rightValues_7= ruleListAssignmentValue )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:972:6: lv_rightValues_7= ruleListAssignmentValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment2006);
                    lv_rightValues_7=ruleListAssignmentValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBiListAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "rightValues", lv_rightValues_7, "ListAssignmentValue", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:990:2: ( ',' (lv_rightValues_9= ruleListAssignmentValue ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==26) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:990:3: ',' (lv_rightValues_9= ruleListAssignmentValue )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleBiListAssignment2020); 

                    	            createLeafNode(grammarAccess.getBiListAssignmentAccess().getCommaKeyword_5_1_0(), null); 
                    	        
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:994:1: (lv_rightValues_9= ruleListAssignmentValue )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:997:6: lv_rightValues_9= ruleListAssignmentValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment2054);
                    	    lv_rightValues_9=ruleListAssignmentValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBiListAssignmentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "rightValues", lv_rightValues_9, "ListAssignmentValue", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleBiListAssignment2071); 

                    createLeafNode(grammarAccess.getBiListAssignmentAccess().getRightSquareBracketKeyword_6(), null); 
                
            match(input,20,FOLLOW_20_in_ruleBiListAssignment2080); 

                    createLeafNode(grammarAccess.getBiListAssignmentAccess().getSemicolonKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBiListAssignment


    // $ANTLR start entryRuleMonoSingleAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1030:1: entryRuleMonoSingleAssignment returns [EObject current=null] : iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF ;
    public final EObject entryRuleMonoSingleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonoSingleAssignment = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1030:62: (iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1031:2: iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMonoSingleAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleMonoSingleAssignment_in_entryRuleMonoSingleAssignment2113);
            iv_ruleMonoSingleAssignment=ruleMonoSingleAssignment();
            _fsp--;

             current =iv_ruleMonoSingleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonoSingleAssignment2123); 

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
    // $ANTLR end entryRuleMonoSingleAssignment


    // $ANTLR start ruleMonoSingleAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1038:1: ruleMonoSingleAssignment returns [EObject current=null] : ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) ';' ) ;
    public final EObject ruleMonoSingleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0=null;
        EObject lv_leftValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1043:6: ( ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) ';' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1044:1: ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) ';' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1044:1: ( (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) ';' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1044:2: (lv_feature_0= RULE_ID ) '=' (lv_leftValue_2= ruleSingleAssignmentValue ) ';'
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1044:2: (lv_feature_0= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1046:6: lv_feature_0= RULE_ID
            {
            lv_feature_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMonoSingleAssignment2170); 

            		createLeafNode(grammarAccess.getMonoSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0(), "feature"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMonoSingleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "feature", lv_feature_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,23,FOLLOW_23_in_ruleMonoSingleAssignment2187); 

                    createLeafNode(grammarAccess.getMonoSingleAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1068:1: (lv_leftValue_2= ruleSingleAssignmentValue )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1071:6: lv_leftValue_2= ruleSingleAssignmentValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMonoSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSingleAssignmentValue_in_ruleMonoSingleAssignment2221);
            lv_leftValue_2=ruleSingleAssignmentValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMonoSingleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "leftValue", lv_leftValue_2, "SingleAssignmentValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,20,FOLLOW_20_in_ruleMonoSingleAssignment2234); 

                    createLeafNode(grammarAccess.getMonoSingleAssignmentAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMonoSingleAssignment


    // $ANTLR start entryRuleMonoListAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1100:1: entryRuleMonoListAssignment returns [EObject current=null] : iv_ruleMonoListAssignment= ruleMonoListAssignment EOF ;
    public final EObject entryRuleMonoListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonoListAssignment = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1100:60: (iv_ruleMonoListAssignment= ruleMonoListAssignment EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1101:2: iv_ruleMonoListAssignment= ruleMonoListAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMonoListAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleMonoListAssignment_in_entryRuleMonoListAssignment2267);
            iv_ruleMonoListAssignment=ruleMonoListAssignment();
            _fsp--;

             current =iv_ruleMonoListAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonoListAssignment2277); 

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
    // $ANTLR end entryRuleMonoListAssignment


    // $ANTLR start ruleMonoListAssignment
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1108:1: ruleMonoListAssignment returns [EObject current=null] : ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )? ']' ';' ) ;
    public final EObject ruleMonoListAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0=null;
        EObject lv_leftValues_3 = null;

        EObject lv_leftValues_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1113:6: ( ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )? ']' ';' ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1114:1: ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )? ']' ';' )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1114:1: ( (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )? ']' ';' )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1114:2: (lv_feature_0= RULE_ID ) '=' '[' ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )? ']' ';'
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1114:2: (lv_feature_0= RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1116:6: lv_feature_0= RULE_ID
            {
            lv_feature_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMonoListAssignment2324); 

            		createLeafNode(grammarAccess.getMonoListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0(), "feature"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMonoListAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "feature", lv_feature_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,23,FOLLOW_23_in_ruleMonoListAssignment2341); 

                    createLeafNode(grammarAccess.getMonoListAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            match(input,25,FOLLOW_25_in_ruleMonoListAssignment2350); 

                    createLeafNode(grammarAccess.getMonoListAssignmentAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1142:1: ( (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||(LA17_0>=31 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1142:2: (lv_leftValues_3= ruleAssignmentValue ) ( ',' (lv_leftValues_5= ruleAssignmentValue ) )*
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1142:2: (lv_leftValues_3= ruleAssignmentValue )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1145:6: lv_leftValues_3= ruleAssignmentValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentValue_in_ruleMonoListAssignment2385);
                    lv_leftValues_3=ruleAssignmentValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMonoListAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "leftValues", lv_leftValues_3, "AssignmentValue", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1163:2: ( ',' (lv_leftValues_5= ruleAssignmentValue ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==26) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1163:3: ',' (lv_leftValues_5= ruleAssignmentValue )
                    	    {
                    	    match(input,26,FOLLOW_26_in_ruleMonoListAssignment2399); 

                    	            createLeafNode(grammarAccess.getMonoListAssignmentAccess().getCommaKeyword_3_1_0(), null); 
                    	        
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1167:1: (lv_leftValues_5= ruleAssignmentValue )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1170:6: lv_leftValues_5= ruleAssignmentValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssignmentValue_in_ruleMonoListAssignment2433);
                    	    lv_leftValues_5=ruleAssignmentValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMonoListAssignmentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "leftValues", lv_leftValues_5, "AssignmentValue", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleMonoListAssignment2450); 

                    createLeafNode(grammarAccess.getMonoListAssignmentAccess().getRightSquareBracketKeyword_4(), null); 
                
            match(input,20,FOLLOW_20_in_ruleMonoListAssignment2459); 

                    createLeafNode(grammarAccess.getMonoListAssignmentAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMonoListAssignment


    // $ANTLR start entryRuleAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1203:1: entryRuleAssignmentValue returns [EObject current=null] : iv_ruleAssignmentValue= ruleAssignmentValue EOF ;
    public final EObject entryRuleAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentValue = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1203:57: (iv_ruleAssignmentValue= ruleAssignmentValue EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1204:2: iv_ruleAssignmentValue= ruleAssignmentValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentValue_in_entryRuleAssignmentValue2492);
            iv_ruleAssignmentValue=ruleAssignmentValue();
            _fsp--;

             current =iv_ruleAssignmentValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentValue2502); 

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
    // $ANTLR end entryRuleAssignmentValue


    // $ANTLR start ruleAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1211:1: ruleAssignmentValue returns [EObject current=null] : ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) ) ;
    public final EObject ruleAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;
        Token lv_refFeature_3=null;
        Token lv_refIndex_5=null;
        Token lv_impFrag_9=null;
        EObject lv_newObject_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1216:6: ( ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1217:1: ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1217:1: ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==RULE_FRAGMENT) ) {
                    alt20=4;
                }
                else if ( (LA20_2==EOF||(LA20_2>=26 && LA20_2<=28)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1217:1: ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) )", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1217:1: ( (lv_value_0= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? ) | (lv_newObject_7= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1217:2: (lv_value_0= RULE_STRING )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1217:2: (lv_value_0= RULE_STRING )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1219:6: lv_value_0= RULE_STRING
                    {
                    lv_value_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignmentValue2549); 

                    		createLeafNode(grammarAccess.getAssignmentValueAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1238:6: ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1238:6: ( ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )? )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1238:7: ( RULE_ID ) ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )?
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1238:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1241:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignmentValue2586); 

                    		createLeafNode(grammarAccess.getAssignmentValueAccess().getRefObjectNamedObjectCrossReference_1_0_0(), "refObject"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1254:2: ( '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1254:3: '.' (lv_refFeature_3= RULE_ID ) ( '[' (lv_refIndex_5= RULE_INT ) ']' )?
                            {
                            match(input,28,FOLLOW_28_in_ruleAssignmentValue2599); 

                                    createLeafNode(grammarAccess.getAssignmentValueAccess().getFullStopKeyword_1_1_0(), null); 
                                
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1258:1: (lv_refFeature_3= RULE_ID )
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1260:6: lv_refFeature_3= RULE_ID
                            {
                            lv_refFeature_3=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignmentValue2621); 

                            		createLeafNode(grammarAccess.getAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_1_1_1_0(), "refFeature"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "refFeature", lv_refFeature_3, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1278:2: ( '[' (lv_refIndex_5= RULE_INT ) ']' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==25) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1278:3: '[' (lv_refIndex_5= RULE_INT ) ']'
                                    {
                                    match(input,25,FOLLOW_25_in_ruleAssignmentValue2639); 

                                            createLeafNode(grammarAccess.getAssignmentValueAccess().getLeftSquareBracketKeyword_1_1_2_0(), null); 
                                        
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1282:1: (lv_refIndex_5= RULE_INT )
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1284:6: lv_refIndex_5= RULE_INT
                                    {
                                    lv_refIndex_5=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssignmentValue2661); 

                                    		createLeafNode(grammarAccess.getAssignmentValueAccess().getRefIndexINTTerminalRuleCall_1_1_2_1_0(), "refIndex"); 
                                    	

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "refIndex", lv_refIndex_5, "INT", lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }

                                    match(input,27,FOLLOW_27_in_ruleAssignmentValue2678); 

                                            createLeafNode(grammarAccess.getAssignmentValueAccess().getRightSquareBracketKeyword_1_1_2_2(), null); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1307:6: (lv_newObject_7= ruleCreatedObject )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1307:6: (lv_newObject_7= ruleCreatedObject )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1310:6: lv_newObject_7= ruleCreatedObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCreatedObject_in_ruleAssignmentValue2723);
                    lv_newObject_7=ruleCreatedObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newObject", lv_newObject_7, "CreatedObject", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1329:6: ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1329:6: ( ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1329:7: ( RULE_ID ) (lv_impFrag_9= RULE_FRAGMENT )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1329:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1332:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignmentValue2756); 

                    		createLeafNode(grammarAccess.getAssignmentValueAccess().getImportModelImportCrossReference_3_0_0(), "import"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1345:2: (lv_impFrag_9= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1347:6: lv_impFrag_9= RULE_FRAGMENT
                    {
                    lv_impFrag_9=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleAssignmentValue2781); 

                    		createLeafNode(grammarAccess.getAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_3_1_0(), "impFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "impFrag", lv_impFrag_9, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignmentValue


    // $ANTLR start entryRuleListAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1372:1: entryRuleListAssignmentValue returns [EObject current=null] : iv_ruleListAssignmentValue= ruleListAssignmentValue EOF ;
    public final EObject entryRuleListAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAssignmentValue = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1372:61: (iv_ruleListAssignmentValue= ruleListAssignmentValue EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1373:2: iv_ruleListAssignmentValue= ruleListAssignmentValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListAssignmentValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleListAssignmentValue_in_entryRuleListAssignmentValue2823);
            iv_ruleListAssignmentValue=ruleListAssignmentValue();
            _fsp--;

             current =iv_ruleListAssignmentValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListAssignmentValue2833); 

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
    // $ANTLR end entryRuleListAssignmentValue


    // $ANTLR start ruleListAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1380:1: ruleListAssignmentValue returns [EObject current=null] : ( (lv_index_0= RULE_INT ) ':' ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) ) ) ;
    public final EObject ruleListAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_index_0=null;
        Token lv_refIndex_3=null;
        Token lv_value_5=null;
        Token lv_refFeature_8=null;
        Token lv_refIndex_10=null;
        Token lv_impFrag_14=null;
        EObject lv_newObject_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1385:6: ( ( (lv_index_0= RULE_INT ) ':' ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1386:1: ( (lv_index_0= RULE_INT ) ':' ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1386:1: ( (lv_index_0= RULE_INT ) ':' ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1386:2: (lv_index_0= RULE_INT ) ':' ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1386:2: (lv_index_0= RULE_INT )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1388:6: lv_index_0= RULE_INT
            {
            lv_index_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListAssignmentValue2880); 

            		createLeafNode(grammarAccess.getListAssignmentValueAccess().getIndexINTTerminalRuleCall_0_0(), "index"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "index", lv_index_0, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,29,FOLLOW_29_in_ruleListAssignmentValue2897); 

                    createLeafNode(grammarAccess.getListAssignmentValueAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1410:1: ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==RULE_FRAGMENT) ) {
                    alt23=5;
                }
                else if ( (LA23_3==EOF||LA23_3==24||(LA23_3>=26 && LA23_3<=28)) ) {
                    alt23=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1410:1: ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) )", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1410:1: ( ( '[' (lv_refIndex_3= RULE_INT ) ']' ) | (lv_value_5= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? ) | (lv_newObject_12= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1410:2: ( '[' (lv_refIndex_3= RULE_INT ) ']' )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1410:2: ( '[' (lv_refIndex_3= RULE_INT ) ']' )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1410:3: '[' (lv_refIndex_3= RULE_INT ) ']'
                    {
                    match(input,25,FOLLOW_25_in_ruleListAssignmentValue2908); 

                            createLeafNode(grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_0_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1414:1: (lv_refIndex_3= RULE_INT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1416:6: lv_refIndex_3= RULE_INT
                    {
                    lv_refIndex_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListAssignmentValue2930); 

                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_0_1_0(), "refIndex"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "refIndex", lv_refIndex_3, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,27,FOLLOW_27_in_ruleListAssignmentValue2947); 

                            createLeafNode(grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1439:6: (lv_value_5= RULE_STRING )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1439:6: (lv_value_5= RULE_STRING )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1441:6: lv_value_5= RULE_STRING
                    {
                    lv_value_5=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListAssignmentValue2976); 

                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getValueSTRINGTerminalRuleCall_2_1_0(), "value"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_5, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1460:6: ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1460:6: ( ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )? )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1460:7: ( RULE_ID ) ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )?
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1460:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1463:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListAssignmentValue3013); 

                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_2_0_0(), "refObject"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1476:2: ( '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )? )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1476:3: '.' (lv_refFeature_8= RULE_ID ) ( '[' (lv_refIndex_10= RULE_INT ) ']' )?
                            {
                            match(input,28,FOLLOW_28_in_ruleListAssignmentValue3026); 

                                    createLeafNode(grammarAccess.getListAssignmentValueAccess().getFullStopKeyword_2_2_1_0(), null); 
                                
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1480:1: (lv_refFeature_8= RULE_ID )
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1482:6: lv_refFeature_8= RULE_ID
                            {
                            lv_refFeature_8=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListAssignmentValue3048); 

                            		createLeafNode(grammarAccess.getListAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_2_1_1_0(), "refFeature"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "refFeature", lv_refFeature_8, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1500:2: ( '[' (lv_refIndex_10= RULE_INT ) ']' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==25) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1500:3: '[' (lv_refIndex_10= RULE_INT ) ']'
                                    {
                                    match(input,25,FOLLOW_25_in_ruleListAssignmentValue3066); 

                                            createLeafNode(grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_2_1_2_0(), null); 
                                        
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1504:1: (lv_refIndex_10= RULE_INT )
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1506:6: lv_refIndex_10= RULE_INT
                                    {
                                    lv_refIndex_10=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListAssignmentValue3088); 

                                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_2_1_2_1_0(), "refIndex"); 
                                    	

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "refIndex", lv_refIndex_10, "INT", lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }

                                    match(input,27,FOLLOW_27_in_ruleListAssignmentValue3105); 

                                            createLeafNode(grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_2_1_2_2(), null); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1529:6: (lv_newObject_12= ruleCreatedObject )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1529:6: (lv_newObject_12= ruleCreatedObject )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1532:6: lv_newObject_12= ruleCreatedObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getListAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCreatedObject_in_ruleListAssignmentValue3150);
                    lv_newObject_12=ruleCreatedObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newObject", lv_newObject_12, "CreatedObject", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1551:6: ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1551:6: ( ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1551:7: ( RULE_ID ) (lv_impFrag_14= RULE_FRAGMENT )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1551:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1554:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListAssignmentValue3183); 

                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getImportModelImportCrossReference_2_4_0_0(), "import"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1567:2: (lv_impFrag_14= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1569:6: lv_impFrag_14= RULE_FRAGMENT
                    {
                    lv_impFrag_14=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleListAssignmentValue3208); 

                    		createLeafNode(grammarAccess.getListAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_2_4_1_0(), "impFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getListAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "impFrag", lv_impFrag_14, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleListAssignmentValue


    // $ANTLR start entryRuleSingleAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1594:1: entryRuleSingleAssignmentValue returns [EObject current=null] : iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF ;
    public final EObject entryRuleSingleAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAssignmentValue = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1594:63: (iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1595:2: iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSingleAssignmentValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleSingleAssignmentValue_in_entryRuleSingleAssignmentValue3251);
            iv_ruleSingleAssignmentValue=ruleSingleAssignmentValue();
            _fsp--;

             current =iv_ruleSingleAssignmentValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleAssignmentValue3261); 

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
    // $ANTLR end entryRuleSingleAssignmentValue


    // $ANTLR start ruleSingleAssignmentValue
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1602:1: ruleSingleAssignmentValue returns [EObject current=null] : ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) ) ;
    public final EObject ruleSingleAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0=null;
        Token lv_value_1=null;
        Token lv_refFeature_4=null;
        Token lv_refIndex_6=null;
        Token lv_impFrag_10=null;
        EObject lv_newObject_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1607:6: ( ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1608:1: ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1608:1: ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==RULE_FRAGMENT) ) {
                    alt26=5;
                }
                else if ( (LA26_3==EOF||LA26_3==20||LA26_3==24||LA26_3==28) ) {
                    alt26=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1608:1: ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) )", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1608:1: ( (lv_keyword_0= 'null' ) | (lv_value_1= RULE_STRING ) | ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? ) | (lv_newObject_8= ruleCreatedObject ) | ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1608:2: (lv_keyword_0= 'null' )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1608:2: (lv_keyword_0= 'null' )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1610:6: lv_keyword_0= 'null'
                    {
                    lv_keyword_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleSingleAssignmentValue3307); 

                            createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getKeywordNullKeyword_0_0(), "keyword"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "keyword", /* lv_keyword_0 */ input.LT(-1), "null", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1630:6: (lv_value_1= RULE_STRING )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1630:6: (lv_value_1= RULE_STRING )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1632:6: lv_value_1= RULE_STRING
                    {
                    lv_value_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleAssignmentValue3348); 

                    		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getValueSTRINGTerminalRuleCall_1_0(), "value"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_1, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1651:6: ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1651:6: ( ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )? )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1651:7: ( RULE_ID ) ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )?
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1651:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1654:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3385); 

                    		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_0_0(), "refObject"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1667:2: ( '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )? )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1667:3: '.' (lv_refFeature_4= RULE_ID ) ( '[' (lv_refIndex_6= RULE_INT ) ']' )?
                            {
                            match(input,28,FOLLOW_28_in_ruleSingleAssignmentValue3398); 

                                    createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getFullStopKeyword_2_1_0(), null); 
                                
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1671:1: (lv_refFeature_4= RULE_ID )
                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1673:6: lv_refFeature_4= RULE_ID
                            {
                            lv_refFeature_4=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3420); 

                            		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_1_1_0(), "refFeature"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "refFeature", lv_refFeature_4, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1691:2: ( '[' (lv_refIndex_6= RULE_INT ) ']' )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==25) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1691:3: '[' (lv_refIndex_6= RULE_INT ) ']'
                                    {
                                    match(input,25,FOLLOW_25_in_ruleSingleAssignmentValue3438); 

                                            createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getLeftSquareBracketKeyword_2_1_2_0(), null); 
                                        
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1695:1: (lv_refIndex_6= RULE_INT )
                                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1697:6: lv_refIndex_6= RULE_INT
                                    {
                                    lv_refIndex_6=(Token)input.LT(1);
                                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSingleAssignmentValue3460); 

                                    		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_1_2_1_0(), "refIndex"); 
                                    	

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "refIndex", lv_refIndex_6, "INT", lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }

                                    match(input,27,FOLLOW_27_in_ruleSingleAssignmentValue3477); 

                                            createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getRightSquareBracketKeyword_2_1_2_2(), null); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1720:6: (lv_newObject_8= ruleCreatedObject )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1720:6: (lv_newObject_8= ruleCreatedObject )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1723:6: lv_newObject_8= ruleCreatedObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSingleAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCreatedObject_in_ruleSingleAssignmentValue3522);
                    lv_newObject_8=ruleCreatedObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newObject", lv_newObject_8, "CreatedObject", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1742:6: ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1742:6: ( ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT ) )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1742:7: ( RULE_ID ) (lv_impFrag_10= RULE_FRAGMENT )
                    {
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1742:7: ( RULE_ID )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1745:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3555); 

                    		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getImportModelImportCrossReference_4_0_0(), "import"); 
                    	

                    }

                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1758:2: (lv_impFrag_10= RULE_FRAGMENT )
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1760:6: lv_impFrag_10= RULE_FRAGMENT
                    {
                    lv_impFrag_10=(Token)input.LT(1);
                    match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleSingleAssignmentValue3580); 

                    		createLeafNode(grammarAccess.getSingleAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_4_1_0(), "impFrag"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSingleAssignmentValueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "impFrag", lv_impFrag_10, "FRAGMENT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSingleAssignmentValue


    // $ANTLR start entryRuleObjectNew
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1785:1: entryRuleObjectNew returns [EObject current=null] : iv_ruleObjectNew= ruleObjectNew EOF ;
    public final EObject entryRuleObjectNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNew = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1785:51: (iv_ruleObjectNew= ruleObjectNew EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1786:2: iv_ruleObjectNew= ruleObjectNew EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectNewRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectNew_in_entryRuleObjectNew3622);
            iv_ruleObjectNew=ruleObjectNew();
            _fsp--;

             current =iv_ruleObjectNew; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectNew3632); 

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
    // $ANTLR end entryRuleObjectNew


    // $ANTLR start ruleObjectNew
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1793:1: ruleObjectNew returns [EObject current=null] : ( 'new' ( RULE_ID ) (lv_impFrag_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? ) ;
    public final EObject ruleObjectNew() throws RecognitionException {
        EObject current = null;

        Token lv_impFrag_2=null;
        Token lv_name_3=null;
        EObject lv_assignments_5 = null;

        EObject lv_assignments_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1798:6: ( ( 'new' ( RULE_ID ) (lv_impFrag_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1799:1: ( 'new' ( RULE_ID ) (lv_impFrag_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1799:1: ( 'new' ( RULE_ID ) (lv_impFrag_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1799:2: 'new' ( RULE_ID ) (lv_impFrag_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )?
            {
            match(input,31,FOLLOW_31_in_ruleObjectNew3666); 

                    createLeafNode(grammarAccess.getObjectNewAccess().getNewKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1803:1: ( RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1806:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectNewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNew3688); 

            		createLeafNode(grammarAccess.getObjectNewAccess().getImportModelImportCrossReference_1_0(), "import"); 
            	

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1819:2: (lv_impFrag_2= RULE_FRAGMENT )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1821:6: lv_impFrag_2= RULE_FRAGMENT
            {
            lv_impFrag_2=(Token)input.LT(1);
            match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleObjectNew3713); 

            		createLeafNode(grammarAccess.getObjectNewAccess().getImpFragFRAGMENTTerminalRuleCall_2_0(), "impFrag"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObjectNewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "impFrag", lv_impFrag_2, "FRAGMENT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1839:2: (lv_name_3= RULE_ID )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1841:6: lv_name_3= RULE_ID
                    {
                    lv_name_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectNew3743); 

                    		createLeafNode(grammarAccess.getObjectNewAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectNewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1859:3: ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1859:4: '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleObjectNew3762); 

                            createLeafNode(grammarAccess.getObjectNewAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1863:1: ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID) ) {
                            int LA28_2 = input.LA(2);

                            if ( (LA28_2==23) ) {
                                int LA28_3 = input.LA(3);

                                if ( (LA28_3==25) ) {
                                    alt28=2;
                                }
                                else if ( ((LA28_3>=RULE_ID && LA28_3<=RULE_STRING)||(LA28_3>=30 && LA28_3<=32)) ) {
                                    alt28=1;
                                }


                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1863:2: (lv_assignments_5= ruleMonoSingleAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1863:2: (lv_assignments_5= ruleMonoSingleAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1866:6: lv_assignments_5= ruleMonoSingleAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectNewAccess().getAssignmentsMonoSingleAssignmentParserRuleCall_4_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMonoSingleAssignment_in_ruleObjectNew3797);
                    	    lv_assignments_5=ruleMonoSingleAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectNewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_5, "MonoSingleAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1885:6: (lv_assignments_6= ruleMonoListAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1885:6: (lv_assignments_6= ruleMonoListAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1888:6: lv_assignments_6= ruleMonoListAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectNewAccess().getAssignmentsMonoListAssignmentParserRuleCall_4_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMonoListAssignment_in_ruleObjectNew3841);
                    	    lv_assignments_6=ruleMonoListAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectNewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_6, "MonoListAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match(input,14,FOLLOW_14_in_ruleObjectNew3856); 

                            createLeafNode(grammarAccess.getObjectNewAccess().getRightCurlyBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObjectNew


    // $ANTLR start entryRuleObjectCopy
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1917:1: entryRuleObjectCopy returns [EObject current=null] : iv_ruleObjectCopy= ruleObjectCopy EOF ;
    public final EObject entryRuleObjectCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectCopy = null;


        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1917:52: (iv_ruleObjectCopy= ruleObjectCopy EOF )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1918:2: iv_ruleObjectCopy= ruleObjectCopy EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectCopyRule(), currentNode); 
            pushFollow(FOLLOW_ruleObjectCopy_in_entryRuleObjectCopy3891);
            iv_ruleObjectCopy=ruleObjectCopy();
            _fsp--;

             current =iv_ruleObjectCopy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectCopy3901); 

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
    // $ANTLR end entryRuleObjectCopy


    // $ANTLR start ruleObjectCopy
    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1925:1: ruleObjectCopy returns [EObject current=null] : ( 'copy' ( RULE_ID ) (lv_fragment_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? ) ;
    public final EObject ruleObjectCopy() throws RecognitionException {
        EObject current = null;

        Token lv_fragment_2=null;
        Token lv_name_3=null;
        EObject lv_assignments_5 = null;

        EObject lv_assignments_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1930:6: ( ( 'copy' ( RULE_ID ) (lv_fragment_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? ) )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1931:1: ( 'copy' ( RULE_ID ) (lv_fragment_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? )
            {
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1931:1: ( 'copy' ( RULE_ID ) (lv_fragment_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )? )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1931:2: 'copy' ( RULE_ID ) (lv_fragment_2= RULE_FRAGMENT ) (lv_name_3= RULE_ID )? ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )?
            {
            match(input,32,FOLLOW_32_in_ruleObjectCopy3935); 

                    createLeafNode(grammarAccess.getObjectCopyAccess().getCopyKeyword_0(), null); 
                
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1935:1: ( RULE_ID )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1938:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getObjectCopyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectCopy3957); 

            		createLeafNode(grammarAccess.getObjectCopyAccess().getResourceNamedResourceCrossReference_1_0(), "resource"); 
            	

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1951:2: (lv_fragment_2= RULE_FRAGMENT )
            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1953:6: lv_fragment_2= RULE_FRAGMENT
            {
            lv_fragment_2=(Token)input.LT(1);
            match(input,RULE_FRAGMENT,FOLLOW_RULE_FRAGMENT_in_ruleObjectCopy3982); 

            		createLeafNode(grammarAccess.getObjectCopyAccess().getFragmentFRAGMENTTerminalRuleCall_2_0(), "fragment"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObjectCopyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "fragment", lv_fragment_2, "FRAGMENT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1971:2: (lv_name_3= RULE_ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1973:6: lv_name_3= RULE_ID
                    {
                    lv_name_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectCopy4012); 

                    		createLeafNode(grammarAccess.getObjectCopyAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getObjectCopyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1991:3: ( '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1991:4: '{' ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleObjectCopy4031); 

                            createLeafNode(grammarAccess.getObjectCopyAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                        
                    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1995:1: ( (lv_assignments_5= ruleMonoSingleAssignment ) | (lv_assignments_6= ruleMonoListAssignment ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            int LA31_2 = input.LA(2);

                            if ( (LA31_2==23) ) {
                                int LA31_3 = input.LA(3);

                                if ( (LA31_3==25) ) {
                                    alt31=2;
                                }
                                else if ( ((LA31_3>=RULE_ID && LA31_3<=RULE_STRING)||(LA31_3>=30 && LA31_3<=32)) ) {
                                    alt31=1;
                                }


                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1995:2: (lv_assignments_5= ruleMonoSingleAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1995:2: (lv_assignments_5= ruleMonoSingleAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:1998:6: lv_assignments_5= ruleMonoSingleAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectCopyAccess().getAssignmentsMonoSingleAssignmentParserRuleCall_4_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMonoSingleAssignment_in_ruleObjectCopy4066);
                    	    lv_assignments_5=ruleMonoSingleAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectCopyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_5, "MonoSingleAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:2017:6: (lv_assignments_6= ruleMonoListAssignment )
                    	    {
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:2017:6: (lv_assignments_6= ruleMonoListAssignment )
                    	    // ../org.eclipse.emf.compare.epatch.dsl/src-gen/org/eclipse/emf/compare/epatch/dsl/parser/antlr/internal/InternalEpatch.g:2020:6: lv_assignments_6= ruleMonoListAssignment
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getObjectCopyAccess().getAssignmentsMonoListAssignmentParserRuleCall_4_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMonoListAssignment_in_ruleObjectCopy4110);
                    	    lv_assignments_6=ruleMonoListAssignment();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getObjectCopyRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "assignments", lv_assignments_6, "MonoListAssignment", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,14,FOLLOW_14_in_ruleObjectCopy4125); 

                            createLeafNode(grammarAccess.getObjectCopyAccess().getRightCurlyBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObjectCopy


 

    public static final BitSet FOLLOW_ruleEpatch_in_entryRuleEpatch73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEpatch83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEpatch117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEpatch139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEpatch156 = new BitSet(new long[]{0x000000000044C000L});
    public static final BitSet FOLLOW_ruleModelImport_in_ruleEpatch190 = new BitSet(new long[]{0x000000000044C000L});
    public static final BitSet FOLLOW_ruleNamedResource_in_ruleEpatch229 = new BitSet(new long[]{0x0000000000444000L});
    public static final BitSet FOLLOW_ruleObjectRef_in_ruleEpatch268 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleEpatch282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelImport_in_entryRuleModelImport315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelImport325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceImport_in_ruleModelImport372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageImport_in_ruleModelImport399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceImport_in_entryRuleResourceImport431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceImport441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleResourceImport475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceImport497 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceImport514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceImport536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPackageImport_in_entryRuleEPackageImport577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPackageImport587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEPackageImport621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEPackageImport643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEPackageImport660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEPackageImport682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedResource_in_entryRuleNamedResource723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedResource733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNamedResource767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedResource789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNamedResource806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNamedResource815 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_16_in_ruleNamedResource826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNamedResource848 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_ruleNamedResource897 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNamedResource911 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNamedResource920 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_16_in_ruleNamedResource931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNamedResource953 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_ruleNamedResource1002 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNamedResource1016 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamedResource1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectRef_in_entryRuleObjectRef1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectRef1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleObjectRef1104 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRef1126 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRef1159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1184 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_19_in_ruleObjectRef1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRef1231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleObjectRef1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRef1295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleObjectRef1320 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleObjectRef1340 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleBiSingleAssignment_in_ruleObjectRef1375 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleBiListAssignment_in_ruleObjectRef1419 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleObjectRef1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_entryRuleCreatedObject1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreatedObject1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNew_in_ruleCreatedObject1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectCopy_in_ruleCreatedObject1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiSingleAssignment_in_entryRuleBiSingleAssignment1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiSingleAssignment1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBiSingleAssignment1644 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiSingleAssignment1661 = new BitSet(new long[]{0x00000001C0000030L});
    public static final BitSet FOLLOW_ruleSingleAssignmentValue_in_ruleBiSingleAssignment1695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBiSingleAssignment1708 = new BitSet(new long[]{0x00000001C0000030L});
    public static final BitSet FOLLOW_ruleSingleAssignmentValue_in_ruleBiSingleAssignment1742 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBiSingleAssignment1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBiListAssignment_in_entryRuleBiListAssignment1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBiListAssignment1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBiListAssignment1845 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBiListAssignment1862 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBiListAssignment1871 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment1906 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleBiListAssignment1920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment1954 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleBiListAssignment1971 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment2006 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleBiListAssignment2020 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleListAssignmentValue_in_ruleBiListAssignment2054 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleBiListAssignment2071 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBiListAssignment2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonoSingleAssignment_in_entryRuleMonoSingleAssignment2113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonoSingleAssignment2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMonoSingleAssignment2170 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMonoSingleAssignment2187 = new BitSet(new long[]{0x00000001C0000030L});
    public static final BitSet FOLLOW_ruleSingleAssignmentValue_in_ruleMonoSingleAssignment2221 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMonoSingleAssignment2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonoListAssignment_in_entryRuleMonoListAssignment2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonoListAssignment2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMonoListAssignment2324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMonoListAssignment2341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMonoListAssignment2350 = new BitSet(new long[]{0x0000000188000030L});
    public static final BitSet FOLLOW_ruleAssignmentValue_in_ruleMonoListAssignment2385 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleMonoListAssignment2399 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_ruleAssignmentValue_in_ruleMonoListAssignment2433 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleMonoListAssignment2450 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMonoListAssignment2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentValue_in_entryRuleAssignmentValue2492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentValue2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignmentValue2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignmentValue2586 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAssignmentValue2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignmentValue2621 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAssignmentValue2639 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssignmentValue2661 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAssignmentValue2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_ruleAssignmentValue2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignmentValue2756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleAssignmentValue2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListAssignmentValue_in_entryRuleListAssignmentValue2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListAssignmentValue2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListAssignmentValue2880 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleListAssignmentValue2897 = new BitSet(new long[]{0x0000000182000030L});
    public static final BitSet FOLLOW_25_in_ruleListAssignmentValue2908 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListAssignmentValue2930 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleListAssignmentValue2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListAssignmentValue2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListAssignmentValue3013 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleListAssignmentValue3026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListAssignmentValue3048 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleListAssignmentValue3066 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListAssignmentValue3088 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleListAssignmentValue3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_ruleListAssignmentValue3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListAssignmentValue3183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleListAssignmentValue3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleAssignmentValue_in_entryRuleSingleAssignmentValue3251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleAssignmentValue3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSingleAssignmentValue3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleAssignmentValue3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3385 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleSingleAssignmentValue3398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3420 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleSingleAssignmentValue3438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSingleAssignmentValue3460 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSingleAssignmentValue3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreatedObject_in_ruleSingleAssignmentValue3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleAssignmentValue3555 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleSingleAssignmentValue3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectNew_in_entryRuleObjectNew3622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectNew3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleObjectNew3666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNew3688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleObjectNew3713 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectNew3743 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleObjectNew3762 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleMonoSingleAssignment_in_ruleObjectNew3797 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleMonoListAssignment_in_ruleObjectNew3841 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleObjectNew3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectCopy_in_entryRuleObjectCopy3891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectCopy3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleObjectCopy3935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectCopy3957 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FRAGMENT_in_ruleObjectCopy3982 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectCopy4012 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleObjectCopy4031 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleMonoSingleAssignment_in_ruleObjectCopy4066 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleMonoListAssignment_in_ruleObjectCopy4110 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleObjectCopy4125 = new BitSet(new long[]{0x0000000000000002L});

}