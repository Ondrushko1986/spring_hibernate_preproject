package hiber.model;


import javax.persistence.*;

@Entity
@Table (name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Car() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", user=" + user +
                '}';
    }
}
