package interview_tests.hopper;

import java.io.*;
import java.util.*;

class Solution {
    public static class Heading {
        protected int weight;
        protected String text;

        public Heading(int weight, String text) {
            this.weight = weight;
            this.text = text;
        }
    }

    public static class Node {
        protected Heading heading;
        protected List<Node> children;

        public Node(Heading heading) {
            this.heading = heading;
            this.children = new ArrayList<>();
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Heading> headings = new ArrayList<>();
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            headings.add(parse(line));
        }
        Node outline = toOutline(headings);
        String html = toHtml(outline);
        System.out.println(html);
    }

    private static Node toOutline(List<Heading> headings) {

        HashMap<Integer, Node> currentRootPerWeight = new HashMap<>();
        Node root = new Node(new Heading(0, ""));
        currentRootPerWeight.put(0, root);

        Node currentNode = new Node(headings.get(0));
        currentRootPerWeight.put(currentNode.heading.weight, currentNode);
        root.children.add(currentNode);

        for (int i = 1; i < headings.size(); i++) {
            Heading heading = headings.get(i);
            Node currentHeadingNode = new Node(heading);
            int currentHeadingWeight = heading.weight;
            currentRootPerWeight.put(heading.weight, currentHeadingNode);

            if (currentHeadingWeight > currentNode.heading.weight) {
                currentNode.children.add(currentHeadingNode);
            } else {
                Node parent = findParentNode(currentRootPerWeight, currentHeadingWeight);
                parent.children.add(currentHeadingNode);
            }
            currentNode = currentHeadingNode;
        }
        return root;
    }

    private static Node findParentNode(HashMap<Integer, Node> roots, int weight) {
        if (roots.get(weight - 1) != null) { return roots.get(weight - 1); } else {
            return findParentNode(roots, weight - 1);
        }
    }

    /**
     * Parses a line of input.
     * This implementation is correct for all predefined test cases.
     */
    private static Heading parse(String record) {
        String[] parts = record.split(" ", 2);
        int weight = Integer.parseInt(parts[0].substring(1));
        Heading heading = new Heading(weight, parts[1].trim());
        return heading;
    }

    /**
     * Converts a node to HTML.
     * This implementation is correct for all predefined test cases.
     */
    private static String toHtml(Node node) {
        StringBuilder buf = new StringBuilder();
        if (!node.heading.text.isEmpty()) {
            buf.append(node.heading.text);
            buf.append("\n");
        }
        Iterator<Node> iter = node.children.iterator();
        if (iter.hasNext()) {
            buf.append("<ol>");

            while (iter.hasNext()) {
                Node child = iter.next();
                buf.append("<li>");
                buf.append(toHtml(child));
                buf.append("</li>");
                if (iter.hasNext()) {
                    buf.append("\n");
                }
            }
            buf.append("</ol>");
        }
        return buf.toString();
    }
}