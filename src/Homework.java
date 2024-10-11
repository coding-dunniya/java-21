import java.util.*;

// class which implements homework questions
public class Homework {

    // main method -- to run homework questions run this method
    public static void main(String[] args) {
        checkValidParenthesis();
    }

    // sort a list of user objects based on their names
    private static void sortUsersBasedOnName() {
        // first create a list to store user objects
        List<User> users = new ArrayList<>();
        users.add(new User(1, "mohit"));
        users.add(new User(2, "kapoor"));
        users.add(new User(3, "sharma"));
        users.add(new User(4, "vaibhav"));

        // sort these objects
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                // we need to compare user names with each other
                // since string objects can be compared with each other
                // string itself implements Comparable
                // we don't need to write the comparision code ourselves
                return o1.getName().compareTo(o2.getName());
            }
        });

        // print list
        CollectionUtils.printItems(users);
    }

    // count frequencies of items in the list
    private static void countListItemFrequencies() {
        List<String> names = new ArrayList<>();
        names.add("India");
        names.add("Asia");
        names.add("Europe");
        names.add("Dubai");
        names.add("India");
        names.add("India");
        names.add("India");
        names.add("Dubai");

        Map<String, Integer> frequencies = new HashMap<>();
        for (String name : names) {
            if (frequencies.containsKey(name)) {
                frequencies.put(name, frequencies.get(name) + 1);
            } else {
                frequencies.put(name, 1);
            }
        }
        CollectionUtils.printMapItems(frequencies);
    }

    // process students as per their grades
    private static void processStudentsGrades() {
        Queue<Student> students = new PriorityQueue<>(new StudentComparator());
        // valid characters list
        String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        // put some students
        for (int i = 0; i < 10; i++) {
            // create a random student to be added to list
            // id field is simple i + 1
            // name is constant
            // random grade between a to z
            // random has next int function which will generate a random number between 0 and less than the bound parameter
            // the bound here is length of valid characters string
            Student student = new Student(i + 1, "mohit_" + (i + 1),
                    "" + validCharacters.charAt(random.nextInt(validCharacters.length())));
            students.add(student);
        }

        while (!students.isEmpty()) {
            Student student = students.poll();
            System.out.println("Process student: " + student);
        }
    }

    // count unique characters in a string using set
    private static void countUniqueCharacters() {
        String input = "Hello World, This is the best java course on YouTube.";
        Set<Character> uniques = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniques.add(c);
        }
        System.out.println("Unique chracters in input string [" + input + "] are: " + uniques.size());
    }

    // create read only list from a normal list
    // read only list is an unmodifiable collection in which you cannot add items
    // you can only read the items i.e, loop the items
    // use case: sometimes you would want to return a collection to the caller of a method
    // example - you write a method to get a users orders in the order service class
    // and you return a list of orders ideally the caller shouldn't be able to change the orders
    // because in an e commerce website whenever a user will make a purchase it will be saved in database
    // and order service is reading from database and returning
    private static void createReadOnlyList() {
        List<String> names = new ArrayList<>();
        List<String> unmodifiableNames = Collections.unmodifiableList(names);
    }

    // count frequencies of word in a string
    private static void countWordFrequencies() {
        String input = "Hello World, This is the best java course on YouTube";
        String[] words = input.split(" ");
        Map<String, Integer> frequencies = new HashMap<>();
        for (String word : words) {
            if (frequencies.containsKey(word)) {
                frequencies.put(word, frequencies.get(word) + 1);
            } else {
                frequencies.put(word, 1);
            }
        }
        CollectionUtils.printMapItems(frequencies);
    }

    // check if a parenthesis string is valid or not
    private static void checkValidParenthesis() {
        List<String> parenthesis = Arrays.asList("((", "))", "())", "(()", "(()()())",
                "()()()()", "((()(())))");
        for (String input : parenthesis) {
            boolean result = doCheckValidParenthesis(input);
            System.out.println("Input String [  " + input + "  ] is " + (result ? "valid" : "invalid"));
        }
    }

    // check parenthesis string is valid or not
    private static boolean doCheckValidParenthesis(String input) {
        // logic is simple push the opening bracket on stack
        // if closing bracket arrives remove top of stack if it's open bracket
        // if stack if empty or top of stack is not open bracket input is invalid
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (top != '(') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

record Student(int id, String name, String grade) {
}

class StudentComparator implements Comparator<Student> {

    // compare one student object with another based on grade
    @Override
    public int compare(Student o1, Student o2) {
        return o1.grade().compareTo(o2.grade());
    }
}