$fs=0.25;$fa=6;
union() {
union() {
translate([-440,200,0])cylinder(h=300, r=25, center=true);
translate([-330,200,0])cylinder(h=300, r=25, center=true);
translate([-220,200,0])cylinder(h=300, r=25, center=true);
translate([-110,200,0])cylinder(h=300, r=25, center=true);
translate([0,200,0])cylinder(h=300, r=25, center=true);
translate([110,200,0])cylinder(h=300, r=25, center=true);
translate([220,200,0])cylinder(h=300, r=25, center=true);
translate([330,200,0])cylinder(h=300, r=25, center=true);
translate([440,200,0])cylinder(h=300, r=25, center=true);
}
difference(){difference(){union() {
cube([1000,300,300],center=true);
translate([0,50,-160])cube([1000,400,20],center=true);
translate([0,50,200])cube([1000,400,100],center=true);
translate([0,50,190])cube([1040,440,20],center=true);
translate([0,250,250])cube([100,10,50],center=true);
}
translate([0,50,250])cube([900,300,50],center=true);
translate([0,250,0])cube([40,20,60],center=true);
translate([0,150,-100])cube([50,20,90],center=true);
}translate([-400,150,90])cube([40,20,60],center=true);
translate([-400,150,0])cube([40,20,60],center=true);
translate([-400,150,-90])cube([40,20,60],center=true);
translate([-320,150,90])cube([40,20,60],center=true);
translate([-320,150,0])cube([40,20,60],center=true);
translate([-320,150,-90])cube([40,20,60],center=true);
translate([-240,150,90])cube([40,20,60],center=true);
translate([-240,150,0])cube([40,20,60],center=true);
translate([-240,150,-90])cube([40,20,60],center=true);
translate([-160,150,90])cube([40,20,60],center=true);
translate([-160,150,0])cube([40,20,60],center=true);
translate([-160,150,-90])cube([40,20,60],center=true);
translate([-80,150,90])cube([40,20,60],center=true);
translate([-80,150,0])cube([40,20,60],center=true);
translate([-80,150,-90])cube([40,20,60],center=true);
translate([0,150,90])cube([40,20,60],center=true);
translate([0,150,0])cube([40,20,60],center=true);
translate([0,150,-90])cube([40,20,60],center=true);
translate([80,150,90])cube([40,20,60],center=true);
translate([80,150,0])cube([40,20,60],center=true);
translate([80,150,-90])cube([40,20,60],center=true);
translate([160,150,90])cube([40,20,60],center=true);
translate([160,150,0])cube([40,20,60],center=true);
translate([160,150,-90])cube([40,20,60],center=true);
translate([240,150,90])cube([40,20,60],center=true);
translate([240,150,0])cube([40,20,60],center=true);
translate([240,150,-90])cube([40,20,60],center=true);
translate([320,150,90])cube([40,20,60],center=true);
translate([320,150,0])cube([40,20,60],center=true);
translate([320,150,-90])cube([40,20,60],center=true);
translate([400,150,90])cube([40,20,60],center=true);
translate([400,150,0])cube([40,20,60],center=true);
translate([400,150,-90])cube([40,20,60],center=true);
}}
