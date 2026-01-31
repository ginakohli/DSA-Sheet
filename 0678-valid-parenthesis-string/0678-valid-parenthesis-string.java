class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> astStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openStack.push(i);
            }
            else if(s.charAt(i) == '*'){
                astStack.push(i);
            }
            else{
                if(!openStack.isEmpty()){
                        openStack.pop();
                }
                else if(!astStack.isEmpty()){
                    astStack.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!openStack.isEmpty() && !astStack.isEmpty()){

            if(openStack.peek() > astStack.peek()){
                return false;
            }

            openStack.pop();
            astStack.pop();


        }
        return openStack.isEmpty();

    }
}