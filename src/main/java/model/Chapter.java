package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member president;
    @ManyToMany
    @JoinTable(name = "chapter_nurses",
    joinColumns = @JoinColumn(name = "chapter_id"),
    inverseJoinColumns = @JoinColumn(name = "nurse_id"))
    private List<Member> list;

    public Chapter() {}

    public Chapter(String name, String district, Member president, List<Member> list) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getList() {
        return list;
    }

    public void setList(List<Member> list) {
        this.list = list;
    }


}
