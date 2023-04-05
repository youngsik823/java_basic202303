package day07.inherit;

public class Mage extends Player{

    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderBolt(Player ... targets) {
        for (Player target : targets) {
            if(target == this){
                continue;
            }
            int atk = (int) (Math.floor(Math.random()*4)+12);
            target.hp-=atk;
            System.out.println(target.nickName+"님이 "+atk+"의 피해를 입었습니다.(남은 체력: "+(target.hp)+")");
        }



    }

    @Override
    public void showStatus() {
        super.showStatus();
            System.out.println("# mana : " + this.mana);
    }
}

