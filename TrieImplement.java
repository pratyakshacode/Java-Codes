

public class TrieImplement {

    static class Trie{
        Node root;

        public class Node{
            char data;
            Node [] children;
            boolean isTerminal;

            // TrieNode
            public Node(char data){
                this.data = data;
                children = new Node[26];

                for(int i=0; i<26; i++){
                    children[i]  = null;
                }

                isTerminal = false;
            }
        }

        public Trie(){
            this.root = new Node('\0');
        }

        public void insert(String str){

            Node child = root;
            str = str.toLowerCase();

            while(str.length() != 0){

                char ch = str.charAt(0);

                if(child.children[ch - 'a'] == null){
                    child.children[ch - 'a'] = new Node(ch);
                }
            
                child = child.children[ch-'a'];

                str = str.substring(1);

            }

            child.isTerminal = true;

        }

        public boolean find(String word){

            if(word == "") return false;

            Node child = root;
            word = word.toLowerCase();

            while(word.length() != 0){

                char ch = word.charAt(0);

                if(child.children[ch - 'a'] != null){
                    child = child.children[ch - 'a'];
                }
                else if(word.length() == 0) return child.isTerminal;
                else{
                    return false;
                } 

                word = word.substring(1);
            }
            
            return true;
        }

        public void remove(String word){

            if(!find(word)){
                System.out.println("No such word found .. ");
                return;
            }

            Node child = root;

            while(word.length() != 0 && child != null){

                char ch = word.charAt(0);
                // System.out.println(child.data);
                child = child.children[ch-'a'];

                word = word.substring(1);
            }

            child.isTerminal = false;
        }

    }
    public static void main(String[] args) {
        
        Trie t = new Trie();
        t.insert("ram");
        System.out.println(t.find(""));
        t.remove("ram");
        
    }
}
