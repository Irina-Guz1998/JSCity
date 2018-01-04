$fs=0.25;$fa=6;
union() {
difference(){translate([0,-8,-10])cube([150,30,90],center=true);
translate([0,-20,18])cube([22.5,75,30],center=true);
translate([0,0,8])sphere(r=11.5);
}translate([-15,0,0])translate([0,15,0])cylinder(h=70, r=4, center=true);
translate([-45,0,0])translate([0,15,0])cylinder(h=70, r=4, center=true);
translate([15,0,0])translate([0,15,0])cylinder(h=70, r=4, center=true);
translate([45,0,0])translate([0,15,0])cylinder(h=70, r=4, center=true);
translate([0,18,0])difference(){translate([5.2513,-10,-24.7487])rotate([0,45,0])cube([75,25,90],center=true);
translate([0,0,2])cube([150,75,60],center=true);
}translate([0,10,15])translate([0,0,20])cube([150,55,1.2],center=true);
}
