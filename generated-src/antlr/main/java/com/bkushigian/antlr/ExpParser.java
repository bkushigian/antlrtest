// $ANTLR 3.5.2 Exp.g 2019-07-31 10:13:48

package com.bkushigian.antlr;
import com.bkushigian.UsedByANTLR;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Number", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'/'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int Number=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Exp.g"; }


	private UsedByANTLR uba = new UsedByANTLR();



	// $ANTLR start "eval"
	// Exp.g:17:1: eval : additionExp ;
	public final void eval() throws RecognitionException {
		try {
			// Exp.g:18:5: ( additionExp )
			// Exp.g:18:10: additionExp
			{
			pushFollow(FOLLOW_additionExp_in_eval38);
			additionExp();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eval"



	// $ANTLR start "additionExp"
	// Exp.g:22:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
	public final void additionExp() throws RecognitionException {
		try {
			// Exp.g:23:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
			// Exp.g:23:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
			{
			pushFollow(FOLLOW_multiplyExp_in_additionExp60);
			multiplyExp();
			state._fsp--;

			// Exp.g:24:10: ( '+' multiplyExp | '-' multiplyExp )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==9) ) {
					alt1=1;
				}
				else if ( (LA1_0==10) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// Exp.g:24:12: '+' multiplyExp
					{
					match(input,9,FOLLOW_9_in_additionExp73); 
					pushFollow(FOLLOW_multiplyExp_in_additionExp75);
					multiplyExp();
					state._fsp--;

					}
					break;
				case 2 :
					// Exp.g:25:12: '-' multiplyExp
					{
					match(input,10,FOLLOW_10_in_additionExp88); 
					pushFollow(FOLLOW_multiplyExp_in_additionExp90);
					multiplyExp();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "additionExp"



	// $ANTLR start "multiplyExp"
	// Exp.g:30:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
	public final void multiplyExp() throws RecognitionException {
		try {
			// Exp.g:31:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
			// Exp.g:31:10: atomExp ( '*' atomExp | '/' atomExp )*
			{
			pushFollow(FOLLOW_atomExp_in_multiplyExp124);
			atomExp();
			state._fsp--;

			// Exp.g:32:10: ( '*' atomExp | '/' atomExp )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==8) ) {
					alt2=1;
				}
				else if ( (LA2_0==11) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// Exp.g:32:12: '*' atomExp
					{
					match(input,8,FOLLOW_8_in_multiplyExp137); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp139);
					atomExp();
					state._fsp--;

					}
					break;
				case 2 :
					// Exp.g:33:12: '/' atomExp
					{
					match(input,11,FOLLOW_11_in_multiplyExp152); 
					pushFollow(FOLLOW_atomExp_in_multiplyExp154);
					atomExp();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multiplyExp"



	// $ANTLR start "atomExp"
	// Exp.g:40:1: atomExp : ( Number | '(' additionExp ')' );
	public final void atomExp() throws RecognitionException {
		try {
			// Exp.g:41:5: ( Number | '(' additionExp ')' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Number) ) {
				alt3=1;
			}
			else if ( (LA3_0==6) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Exp.g:41:10: Number
					{
					match(input,Number,FOLLOW_Number_in_atomExp188); 
					}
					break;
				case 2 :
					// Exp.g:42:10: '(' additionExp ')'
					{
					match(input,6,FOLLOW_6_in_atomExp199); 
					pushFollow(FOLLOW_additionExp_in_atomExp201);
					additionExp();
					state._fsp--;

					match(input,7,FOLLOW_7_in_atomExp203); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atomExp"

	// Delegated rules



	public static final BitSet FOLLOW_additionExp_in_eval38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp60 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_9_in_additionExp73 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp75 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_10_in_additionExp88 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp90 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp124 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_8_in_multiplyExp137 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp139 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_11_in_multiplyExp152 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp154 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_Number_in_atomExp188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_atomExp199 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_additionExp_in_atomExp201 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_atomExp203 = new BitSet(new long[]{0x0000000000000002L});
}
