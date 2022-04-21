package lesson11;

public class Team {
    private Person leader;
    private Person member;

    public Team(Person leader, Person member) {
        this.leader = leader;
        this.member = member;
    }

    public Person getLeader() {
        return leader;
    }

    public Person getMember() {
        return member;
    }
}
