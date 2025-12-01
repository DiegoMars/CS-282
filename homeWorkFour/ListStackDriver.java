// ListStackDriver.java
// Starter file for the Stack portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runS4_ReverseWord).

public class ListStackDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        // runS1_BrowserBackButton();
        // runS2_TextEditorUndo();
        // runS3_BalancedParentheses();
        // runS4_ReverseWord();
        // runS5_DirectoryNavigation();
        // runS6_CalculatorHistory();
        // runS7_PalindromeChecker();
        // runS8_FunctionCallStack();
        runS9_StackOfPlates();
    }

    // S1 – Browser Back Button
    private static void runS1_BrowserBackButton() {
        // TODO: Implement task S1 here.
        ListStack<String> sites = new ListStack<String>();
        sites.push("google.com");
        System.out.println(sites.peek());
        sites.push("youtube.com");
        System.out.println(sites.peek());
        sites.pop();
        System.out.println(sites.peek());
        sites.push("twitch.tv");
        System.out.println(sites.peek());
    }

    // S2 – Undo in a Text Editor
    private static void runS2_TextEditorUndo() {
        // TODO: Implement task S2 here.
        ListStack<String> undo = new ListStack<String>();
        undo.push("Change 1");
        System.out.println(undo.peek());
        undo.push("Change 2");
        System.out.println(undo.peek());
        undo.pop();
        System.out.println(undo.peek());
        undo.push("Change 3");
        System.out.println(undo.peek());
    }

    // S3 – Checking Balanced Parentheses
    static public boolean balPar(String par) {
        ListStack<Character> stack = new ListStack<Character>();
        for (int i = 0; i < par.length(); i++) {
            char c = par.charAt(i);
            switch (c) {
                case ')':
                    if (stack.peek() != '('){
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.peek() != '['){
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.peek() != '{'){
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                default:
                    continue;
            }
        }
        return true;
    }
    private static void runS3_BalancedParentheses() {
        // TODO: Implement task S3 here.
        String test = "(){}[]";
        String test1 = "([)]";
        System.out.println(balPar(test));
        System.out.println(balPar(test1));
    }

    // S4 – Reversing a Word Using a Stack
    static public String reverse(String word){
        ListStack<Character> stack = new ListStack<Character>();
        String rThis = "";
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()) {
            rThis = rThis + stack.pop();
        }
        return rThis;
    }
    private static void runS4_ReverseWord() {
        // TODO: Implement task S4 here.
        String test = "dog";
        String test1 = "because";
        System.out.println(test);
        System.out.println(reverse(test));
        System.out.println(test1);
        System.out.println(reverse(test1));
    }

    // S5 – Directory Navigation (cd / cd ..)
    private static void runS5_DirectoryNavigation() {
        // TODO: Implement task S5 here.
        ListStack<String> directory = new ListStack<String>();
        String[] test = {"cd repos", "cd ..", "cd Downloads", "cd ..", "cd Documents", "cd Phone"};
        for (int i = 0; i < test.length; i++) {
            String folder = test[i].substring(3);
            if (folder.equals("..")){
                directory.pop();
            } else {
                directory.push(folder);
            }
        }
        for (int i = 1; !directory.isEmpty(); i++) {
            System.out.println(i + ": " + directory.pop());
        }
    }

    // S6 – History of Calculator Operations
    private static void runS6_CalculatorHistory() {
        // TODO: Implement task S6 here.
        ListStack<String> history = new ListStack<String>();
        history.push("5 + 3 = 8");
        System.out.println(history.peek());
        history.push("2 * 2 = 4");
        System.out.println(history.peek());
        history.pop();
        System.out.println(history.peek());
        history.push("5 * 3 = 15");
        System.out.println(history.peek());
    }

    // S7 – Palindrome Checker
    static public boolean palindrome(String word) {
        ListStack<Character> stack = new ListStack<Character>();
        for (int i = 0; i < word.length(); i ++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++){
            if (stack.pop() != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    private static void runS7_PalindromeChecker() {
        // TODO: Implement task S7 here.
        String[] test = {"abba", "idk", "happy", "dad"};
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + ": " + palindrome(test[i]));
        }
    }

    // S8 – Function Call Stack Simulator
    private static void runS8_FunctionCallStack() {
        // TODO: Implement task S8 here.
        ListStack<String> callStack = new ListStack<String>();
        callStack.push("0x0800010C");
        System.out.println(callStack.peek());
        callStack.push("0x08000020");
        System.out.println(callStack.peek());
        callStack.pop();
        System.out.println(callStack.peek());
        callStack.push("0x08000150");
        System.out.println(callStack.peek());
    }

    // S9 – Stack of Plates (Capacity-Limited Stack)
    private static void runS9_StackOfPlates() {
        // TODO: Implement task S9 here.
        int limit = 3;
        ListStack<String> stack = new ListStack<String>();
        String[] test = {"Plate", "Plate", "Plate", "Plate"};
        for (int i = 0; i < test.length; i++) {
            if (stack.size() < limit) {
                stack.push(test[i]);
                System.out.println(stack.peek());
                continue;
            }
            System.out.println("Hit limit");
        }
    }
}
