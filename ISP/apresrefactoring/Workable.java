package ict301.solid.isp;

interface Workable {
    void work();
}

interface Eatable extends Workable {
    void eat();
}