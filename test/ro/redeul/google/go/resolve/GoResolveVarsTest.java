package ro.redeul.google.go.resolve;

/**
 * Author: Toader Mihai Claudiu <mtoader@gmail.com>
 * <p/>
 * Date: Sep 8, 2010
 * Time: 2:59:17 PM
 */
public class GoResolveVarsTest extends GoPsiResolveTestCase {

    @Override
    protected String getTestDataRelativePath() {
        return super.getTestDataRelativePath() + "vars/";
    }

    public void testDeclaredInForRange() throws Exception {
        doTest();
    }

    public void testDeclaredInForRange2() throws Exception {
        doTest();
    }

    public void testDeclaredInForRangeAsValue() throws Exception {
        doTest();
    }

    public void testDeclaredInForClause() throws Exception {
        doTest();
    }

    public void testMethodReturn() throws Exception {
        doTest();
    }

    public void testSimpleMethodParameter() throws Exception {
        doTest();
    }

    public void testMethodReturn2() throws Exception {
        doTest();
    }

    public void testResolveMethodReceiver() throws Exception {
        doTest();
    }

    public void testGlobalVarDeclaration() throws Exception {
        doTest();
    }

    public void testGlobalShadowedVarDeclaration() throws Exception {
        doTest();
    }

    public void testGlobalVarDeclarationFromBlock() throws Exception {
        doTest();
    }

    public void testShortVarDeclaration() throws Exception {
        doTest();
    }

    public void testShortVarDeclarationFromBlock() throws Exception {
        doTest();
    }

    public void testGlobalConstDeclaration() throws Exception {
        doTest();
    }

    public void testFromDefaultImportedPackage() throws Exception {
        doTest();
    }

    public void testFromInjectedImportedPackage() throws Exception {
        doTest();
    }

    public void testFromCustomImportedPackage() throws Exception {
        doTest();
    }

    public void testResolveToMethod() throws Exception {
        doTest();
    }

    public void testResolveToFunction() throws Exception {
        doTest();
    }

    public void testLocalConstDeclaration() throws Exception {
        doTest();
    }

    public void testChainedSelector() throws Exception {
        doTest();
    }

    public void testVarInSwitchExpr() throws Exception {
        doTest();
    }

    public void testVarInSwitchType() throws Exception {
        doTest();
    }

    public void testMultipleGlobalVars() throws Exception {
        doTest();
    }

    public void testMultipleGlobalConsts() throws Exception {
        doTest();
    }
}
