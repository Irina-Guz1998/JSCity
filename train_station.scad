$fs=0.25;$fa=6;
union() {
cube([80,40,40],center=true);
translate([55,0,0])translate([0,10,-50])cube([20,20,20],center=true);
translate([-55,0,0])translate([0,10,-50])cube([20,20,20],center=true);
translate([55,0,0])translate([0,0,-10])cube([20,40,60],center=true);
translate([-55,0,0])translate([0,0,-10])cube([20,40,60],center=true);
translate([110,0,0])cube([80,40,40],center=true);
translate([-110,0,0])cube([80,40,40],center=true);
}
