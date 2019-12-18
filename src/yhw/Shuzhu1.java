package yhw;

public class Shuzhu1 {

	public static void main(String[] args) {
		String[] yhw={"管理学院","教育学院","演艺学院","设计学院","音乐学院","中专部","饮食文化学院","对方可以休息"};
		
/*	0,1,2,3,4,5
 * 第一轮对阵
 * 0vs5 1vs4 2vs3
 * 第二轮对阵
 * 最后一个队移动到第一个对后面，其余的队伍瞬移
 * 0,5,1,2,3,4
 * 
 * 0vs4 5vs3 1vs2
 * 第三轮对阵
 * 最后一个队移动到第一个对后面，其余的队伍瞬移
 * 0,4,5,1,2,3,
 * 
 * 0vs3 4vs2 5vs1
 *第四轮对阵
 * 最后一个队移动到第一个对后面，其余的队伍瞬移
 * 0,3,4,5,1,2,
 * 
 * 0vs2 3vs1 4vs5
 * 第五轮对阵
 * 最后一个队移动到第一个对后面，其余的队伍瞬移
 * 0,2,3,4,5,1
 * 
 * 0vs1 2vs5 3vs4
*/
		System.out.println("第九届江汉艺术职业学院篮球赛:");
		for (int i = 1; i < yhw.length; i++) {
			System.out.println("第"+i+"轮");
			
			if(i>1) {
				int k =yhw.length-1;
				String smpt=yhw[k];
				for (;k >1; k--) 
					yhw[k] = yhw[k-1];
					
				yhw[1]=smpt;
			}
			
			for (int j = 0; j < yhw.length/2; j++) {
				System.out.println(yhw[j]+"vs"+yhw[yhw.length-j-1]);
			}
			
		}
	}

}
