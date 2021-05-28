clc
clear all
close all

t_brut=xlsread('Ultimile 12 luni.xlsx','Sheet1','A2:A260');
t_string=datestr(datenum(num2str(t_brut, '%d'), 'yyyymmdd'), 'yyyy-mm-dd');
t=datetime(t_string,'InputFormat','yyyy-MM-dd')';
Franta=xlsread('Ultimile 12 luni.xlsx','Sheet1','C2:C260');
Germania=xlsread('Ultimile 12 luni.xlsx','Sheet1','F2:F260');
Italia=xlsread('Ultimile 12 luni.xlsx','Sheet1','I2:I260');
figure(1)
plot(t,Franta,'blue');
ylim([750 1400])
ylabel('Percentage Change');
xlabel('Time');
title('Index Percentage Change');
hold on
plot(t,Germania,'magenta');
plot(t,Italia,'red');
legend('France','Germany','Italy');
hold off
figure(2)
plot(t,Franta,'blue');
ylim([750 1400])
ylabel('Percentage Change');
xlabel('Time');
legend('France');
title('France');
figure(3)
plot(t,Germania,'magenta');
ylim([750 1400])
ylabel('Percentage Change');
xlabel('Time');
legend('Germany');
title('Germany');
figure(4)
plot(t,Italia,'red');
ylim([750 1400])
ylabel('Percentage Change');
xlabel('Time');
legend('Italy');
title('Italy');





