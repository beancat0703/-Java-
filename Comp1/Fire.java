class Soldier
{
    public String name;
    public Gun gun;

    public Soldier(String name, Gun gun)
    {
        this.name = name;
        this.gun = gun;
    }
}

class Gun
{
    public String name;
    public int bullet;
    public int remainingBullet;

    public Gun(String name, int bullet)
    {
        this.name = name;
        this.bullet = bullet;
        this.remainingBullet = bullet;
    }

    public void fire()
    {
        if (bullet > 0)
        {
            System.out.println("Fire!");
            remainingBullet -= 1;
            System.out.println("剩余子弹：" + remainingBullet);
        }
    }

    public void reload()
    {
        System.out.println("装填弹药...");
        remainingBullet = bullet;
    }
}

public class Fire 
{
    public static void main(String[] args)
    {   
        Gun ak47 = new Gun("AK47", 30);
        Soldier ryan = new Soldier("Ryan", ak47);

        ryan.gun.fire();
        ryan.gun.fire();
        ryan.gun.fire();
        ryan.gun.reload();
        ryan.gun.fire();
    }
}
