$fs=0.25;$fa=6;
union() {
difference(){cube([550,40,280],center=true);
translate([-210,30,-80])cube([35,30,50],center=true);
translate([-210,30,1])cube([35,30,50],center=true);
translate([-210,30,80])cube([35,30,50],center=true);
translate([-130,30,80])cube([35,30,50],center=true);
translate([-130,30,-80])cube([35,30,50],center=true);
translate([-130,30,1])cube([35,30,50],center=true);
translate([-45,30,80])cube([35,30,50],center=true);
translate([-45,30,1])cube([35,30,50],center=true);
translate([-45,30,-80])cube([35,30,50],center=true);
translate([210,30,-80])cube([35,30,50],center=true);
translate([210,30,1])cube([35,30,50],center=true);
translate([210,30,80])cube([35,30,50],center=true);
translate([130,30,80])cube([35,30,50],center=true);
translate([130,30,-80])cube([35,30,50],center=true);
translate([130,30,1])cube([35,30,50],center=true);
translate([45,30,80])cube([35,30,50],center=true);
translate([45,30,1])cube([35,30,50],center=true);
translate([45,30,-80])cube([35,30,50],center=true);
translate([280,30,20])cube([30,30,60],center=true);
translate([280,30,60])cube([30,30,60],center=true);
translate([280,30,150])cube([30,30,60],center=true);
translate([280,30,110])cube([30,30,60],center=true);
translate([280,30,-110])cube([30,30,120],center=true);
}difference(){translate([370,0,70])cube([250,40,420],center=true);
translate([280,30,20])cube([30,30,60],center=true);
translate([280,30,120])cube([30,30,60],center=true);
translate([280,30,220])cube([30,30,60],center=true);
translate([360,30,20])cube([60,30,60],center=true);
translate([360,30,120])cube([60,30,60],center=true);
translate([360,30,220])cube([60,30,60],center=true);
translate([440,30,20])cube([30,30,60],center=true);
translate([440,30,120])cube([30,30,60],center=true);
translate([440,30,220])cube([30,30,60],center=true);
translate([360,30,-110])cube([60,30,120],center=true);
translate([280,30,-110])cube([30,30,120],center=true);
translate([440,30,-110])cube([30,30,120],center=true);
}difference(){translate([0,0,155])cube([550,35,47],center=true);
translate([280,30,120])cube([30,30,60],center=true);
translate([45,30,140])cube([70,30,60],center=true);
translate([-130,30,140])cube([70,30,60],center=true);
translate([-210,30,140])cube([70,30,60],center=true);
translate([130,30,140])cube([70,30,60],center=true);
translate([-45,30,140])cube([70,30,60],center=true);
translate([210,30,140])cube([70,30,60],center=true);
}}