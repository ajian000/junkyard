#include <stdio.h>

// 定义复杂工程问题的参数和条件结构体
typedef struct {
    //分别为两个固定电阻阻值
    float resistance1;
    float resistance2;
    //可调电阻阻值
    float resistance0;
    //电源电压
    float powerVoltage;
    //限流电阻阻值
    float currentLimitingResistor;
} ComplexProblem;
    
// 定义预测结果的结构体
typedef struct {
    //待测电阻阻值
    float resistanceToBeMeasured;
    //灵敏电流计示数
    float sensitiveGalvanometerIndication;
} PredictionResult;

// 根据给定的参数和条件，进行预测与模拟
PredictionResult predictAndSimulate(ComplexProblem problem) {
    PredictionResult result;
    result.resistanceToBeMeasured = resistance0*(resistance1/resistance2);
    return result;
}


int main() {
    //定义变量部分
    ComplexProblem problem;
    PredictionResult result;
    //用于控制流程
    int control = 0;
    //临时变量
    int temp;

    //主逻辑部分
    printf("请输入电阻r1阻值:\n");
    scanf("%f",&resistance1);
    printf("请输入电阻r2阻值:\n");
    scanf("%f",&resistance2);
    control++;
    printf("请输入电源电压:\n");
    scanf("%d",&powerVoltage);
    
    while(1){
        if(control == 0){
            printf("请选择:\n1.重新输入r1,r2  2.重新输入电源电压 3.重新输入限流电阻R 4.继续 5.退出程序");
        }
        if(control == 1){
            printf("请输入电阻r1阻值\n");
            scanf("%f",&problem.resistance1);
            printf("请输入电阻r2阻值\n");
            scanf("%f",&problem.resistance2);
            control = 0;
        }
        if(control == 2){
            printf("请输入电源电压:\n");
            scanf("%d",&problem.powerVoltage);
            control = 0;
        }
        if(control == 3){
            printf("请输入限流电阻阻值:\n");
            scanf("%d",&problem.currentLimitingResistor);
            control = 0;
        }
        if(control == 4){
            printf(请输入电阻r0的值\n);
            scanf("%f",&problem.resistance0);
            result = predictAndSimulate(problem);
            printf("待测电阻阻值为%.2f",result.resistanceToBeMeasured);
            break;
        }
        if(control == 5){
            break;
        }
    }

    return 0;
}
