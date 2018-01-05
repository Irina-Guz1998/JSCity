$fs=0.25;$fa=6;
union() {
difference(){cube([7.8,47.8,9.6],center=true);
translate([0,0,-1.5])cube([4.8,44.8,8.1],center=true);
}union() {
translate([0,-16,0])cylinder(h=9.6, r=1.5, center=true);
translate([0,-8,0])cylinder(h=9.6, r=1.5, center=true);
cylinder(h=9.6, r=1.5, center=true);
translate([0,8,0])cylinder(h=9.6, r=1.5, center=true);
translate([0,16,0])cylinder(h=9.6, r=1.5, center=true);
}
union() {
translate([0,-20,5.7])cylinder(h=1.8, r=2.425, center=true);
translate([0,-12,5.7])cylinder(h=1.8, r=2.425, center=true);
translate([0,-4,5.7])cylinder(h=1.8, r=2.425, center=true);
translate([0,4,5.7])cylinder(h=1.8, r=2.425, center=true);
translate([0,12,5.7])cylinder(h=1.8, r=2.425, center=true);
translate([0,20,5.7])cylinder(h=1.8, r=2.425, center=true);
}
}
