package PriorityQueue;

import java.util.PriorityQueue;

public class pqforobjects {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) { // Correct method name
            return this.rank - s2.rank; // Smaller rank → higher priority
        }
    }

    public static void main(String args[]) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        // Correct way to add objects
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 6));
        pq.add(new Student("D", 7));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank);
            pq.remove();
        }
    }
}
