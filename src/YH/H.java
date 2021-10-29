package YH;

public class H {
    Room[][] room=new Room[3][4];

    public H() {
        for(int i=0;i< room.length;i++){
            for(int j=0;j<room[i].length;j++){
                switch (i){
                    case 0:room[i][j]=new Room((i+1)*100+j+1,"双人间",true);
                    break;
                    case 1:room[i][j]=new Room((i+1)*100+j+1,"大床房",true);
                    break;
                    case 2:room[i][j]=new Room((i+1)*100+j+1,"总统套房",true);
                    break;
                }
            }
        }
    }
    public void print(){
        for(int m=0;m< room.length;m++){
            for(int n=0;n<room[m].length;n++){
                System.out.println(room[m][n]);
            }
        }
    }
    public void order(int num) {
        if (num < 105 && num > 100&&room[0][num % 100 - 1].status) {
            System.out.println("您预订的房间是" + room[0][num % 100 - 1]);
            room[0][num % 100 - 1].status = false;
        } else if (num < 205 && num > 200&&room[1][num % 200 - 1].status) {
            System.out.println("您预订的房间是" + room[1][num % 200 - 1]);
            room[1][num % 200 - 1].status = false;
        } else if (num < 305 && num > 300&&room[2][num % 300 - 1].status) {
            System.out.println("您预订的房间是" + room[2][num % 300 - 1]);
            room[2][num % 300 - 1].status = false;
        } else {
            System.out.println("您输入的房间号不存在！或房间已被占用");
        }
    }
    public void exit(int num){
        if(num>100&&num<105){
            System.out.println("您退订的房间是"+room[0][num%100-1]);
            room[0][num%100-1].status=true;
        }else if(num>200&&num<205){
            System.out.println("您退订的房间是"+room[1][num%100-1]);
            room[1][num%100-1].status=true;
        }else if(num>300&&num<305){
            System.out.println("您退订的房间是"+room[2][num%100-1]);
            room[2][num%100-1].status=true;
        }else {
            System.out.println("您输入的房间号不存在！");
        }
    }
}
