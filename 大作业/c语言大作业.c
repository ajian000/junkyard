#include <stdio.h>
#include <stdlib.h>

// 定义复杂工程问题的参数和条件结构体
typedef struct {
    //分别为两个固定电阻阻值
    float r1;
    float r2;
    //可调电阻阻值
    float r0;
    //电源电压
    float Voltage;
    //限流电阻阻值
    float R;
} ComplexProblem;
    
// 定义预测结果的结构体
typedef struct {
    //灵敏电流计示数
    float Voltage;
} PredictionResult;


/**根据给定的参数和条件，进行预测与模拟
 * @param problem ComplexProblem 包含已知条件的结构体
 * @return PredictionResult 包含结果的结构体
 * @Deprecated
PredictionResult predictAndSimulate(ComplexProblem problem) {
    PredictionResult result;  
    return result;
}

/**求电流计示数
 * @param problem ComplexProblem 包含已知条件的结构体
 * @return float 返回灵敏电流计示数
 * @
*/
float getVoltage(ComplexProblem problem){
//TODO 这里要写获取电压表示数的方法
    return v*(((R0+r1)*(rx+r2)/(ro+r1+rx+r2))/((R0+r1)*(rx+r2)/(ro+r1+rx+r2)+R))*(r0/(r0+r1)-rx/(rx+r2))
;
}



int main() {
    //定义变量部分
    ComplexProblem problem;
    PredictionResult result;
    //用于控制流程
    int control = 0;
    //临时变量@Deprecated
    int temp;
    //待测电阻阻值,随机生成 
    float rx = rand();
    printf("%f",rx); 
	
    //初始化部分
    printf("请输入电阻r1阻值:\n");
    scanf("%f",&problem.r1);
    printf("请输入电阻r2阻值:\n");
    scanf("%f",&problem.r2);
    printf("请输入电源电压:\n");
    scanf("%d",&problem.Voltage);
    
    //主逻辑部分
    while(1){
        if(control == 0){
            printf("请选择:\n1.重新输入r1,r2  2.重新输入电源电压 3.重新输入限流电阻R 4.继续 5.退出程序");
            scanf("%d",&control);
        }
        //改电阻
        if(control == 1){
            printf("请输入电阻r1阻值\n");
            scanf("%f",&problem.r1);
            printf("请输入电阻r2阻值\n");
            scanf("%f",&problem.r2);
            control = 0;
        }
        //改电压
        if(control == 2){
            printf("请输入电源电压:\n");
            scanf("%d",&problem.Voltage);
            control = 0;
        }
        //改限流电阻
        if(control == 3){
            printf("请输入限流电阻阻值:\n");
            scanf("%d",&problem.R);
            control = 0;
        }
        //测试
        if(control == 4){
            control = 0;
            while(1){         
                if(control == 0){
                    printf("请选择模式:\n1.手动调整\2.n自动调整");
                    scanf("%d",&control);
                }
                if(control == 2){
                    printf("当电压表示数为0时,r0阻值为%.2f",rx);
                    break;
                }
                if(control == 1){
                    printf("请输入电阻r0的值\n");
                    scanf("%f",&problem.r0);
                    printf("电压表示数为:%.8f\n",getVoltage);
                    control = 4;
                }
                if(control == 4){
                    printf("请选择模式:\n1.重新手动调整\2.n自动调整\n3.结束");
                    scanf("%d",&control);
                }
            }
        }
        if(control == 5){
            break;
        }
    }

    return 0;
}

