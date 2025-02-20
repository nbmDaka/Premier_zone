package com.pl.premier_zone.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {

    @Id
    @Column(name="name", unique = true)
    private String name;
    private String nation;
    private String pos;
    private Integer age;
    private Integer level;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk;
    private Double cardy;
    private Double cardr;
    private Double xag;
    private String team;

    public Player() {

    }

    public Player(String name, String nation, String pos, Integer age, Integer level, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double cardy, Double cardr, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.level = level;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.cardy = cardy;
        this.cardr = cardr;
        this.xag = xag;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(Double gls) {
        this.gls = gls;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getCardy() {
        return cardy;
    }

    public void setCardy(Double cardy) {
        this.cardy = cardy;
    }

    public Double getCardr() {
        return cardr;
    }

    public void setCardr(Double cardr) {
        this.cardr = cardr;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
