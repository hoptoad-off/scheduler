package management;

import model.Cohort;
import model.University;
import util.InputReader;

public class CohortManage implements CRUD {
    private final Cohort[] cohorts = University.cohorts;
    private final InputReader inputReader = InputReader.instance;

    @Override
    public void add() {
        System.out.print("Enter cohort id: ");
        int id = inputReader.readInt();

        System.out.print("Enter cohort name: ");
        String name = inputReader.readLine();

        System.out.print("Enter cohort's major: ");
        String major = inputReader.readLine();

        System.out.print("Is cohort studying? (true/false): ");
        boolean isStudying = inputReader.readBoolean();

        Cohort cohort = new Cohort();

        cohort.setId(id);
        cohort.setName(name);
        cohort.setMajor(major);
        cohort.setStudying(isStudying);

        int i = 0;
        while (cohorts[i] != null) {
            i++;
        }

        cohorts[i] = cohort;
    }

    @Override
    public void remove() {
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();
        cohorts[index] = null;
    }

    @Override
    public void printAll() {
        System.out.println("Cohort List:");

        for (int i = 0; i < cohorts.length; i++) {
            Cohort cohort = cohorts[i];

            if (cohort != null) {
                System.out.println(i + "." + cohort.toString());
            }
        }
    }
}