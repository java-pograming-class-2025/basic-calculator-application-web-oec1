package ch03_object01;

public class Fighter extends Human {
    Fighter(String name,int hp){
        super(name,hp);
        System.out.println(this.name+"があらわれた");
    }

    @Override
    void action(){
        System.out.println(this.name+"は行動した");
    }
    void die(){
        System.out.println(this.name+"は死んでしまった");
    }
}
