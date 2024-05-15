//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.06.2022 - 02:41:33
// Last changed on: 25.06.2022 - 02:41:33

package com.thedoctor1138.train.client.render.models; //Path where the model is located


import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelClass20 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelClass20() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[534];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 53
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 29
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 30
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 39
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 42
		bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 47
		bodyModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 48
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 51
		bodyModel[24] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 53
		bodyModel[26] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 54
		bodyModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 55
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 92
		bodyModel[29] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 93
		bodyModel[30] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 97
		bodyModel[31] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 56
		bodyModel[35] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		bodyModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 35
		bodyModel[38] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 35
		bodyModel[39] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 35
		bodyModel[40] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 35
		bodyModel[41] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 35
		bodyModel[42] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 66
		bodyModel[45] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 67
		bodyModel[46] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 57
		bodyModel[59] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 57
		bodyModel[60] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 57
		bodyModel[61] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 57
		bodyModel[62] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 57
		bodyModel[63] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 57
		bodyModel[64] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 57
		bodyModel[65] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 57
		bodyModel[66] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 57
		bodyModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 57
		bodyModel[68] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 57
		bodyModel[69] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 57
		bodyModel[70] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 35
		bodyModel[71] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 35
		bodyModel[72] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 35
		bodyModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		bodyModel[74] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 35
		bodyModel[75] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 35
		bodyModel[76] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 35
		bodyModel[77] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 35
		bodyModel[78] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[79] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[80] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[81] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[82] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 125
		bodyModel[83] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 66
		bodyModel[84] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 66
		bodyModel[85] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 66
		bodyModel[86] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 66
		bodyModel[87] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 125
		bodyModel[88] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 125
		bodyModel[89] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 125
		bodyModel[90] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
		bodyModel[91] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 66
		bodyModel[92] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 66
		bodyModel[93] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[94] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 125
		bodyModel[95] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 125
		bodyModel[96] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[114] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[115] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[116] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[117] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 125
		bodyModel[118] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[119] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[120] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[121] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 125
		bodyModel[122] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 125
		bodyModel[123] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 473, 30, textureX, textureY); // Box 125
		bodyModel[127] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 125
		bodyModel[128] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		bodyModel[129] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 26
		bodyModel[130] = new ModelRendererTurbo(this, 390, 160, textureX, textureY); // Box 26
		bodyModel[131] = new ModelRendererTurbo(this, 246, 173, textureX, textureY); // Box 96
		bodyModel[132] = new ModelRendererTurbo(this, 128, 174, textureX, textureY); // Box 96
		bodyModel[133] = new ModelRendererTurbo(this, 241, 189, textureX, textureY); // Box 96
		bodyModel[134] = new ModelRendererTurbo(this, 21, 174, textureX, textureY); // Box 96
		bodyModel[135] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 96
		bodyModel[136] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 96
		bodyModel[137] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 96
		bodyModel[138] = new ModelRendererTurbo(this, 449, 77, textureX, textureY); // Box 96
		bodyModel[139] = new ModelRendererTurbo(this, 193, 194, textureX, textureY); // Box 96
		bodyModel[140] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 96
		bodyModel[141] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 116
		bodyModel[142] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 116
		bodyModel[143] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // lamp
		bodyModel[144] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // lamp
		bodyModel[145] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // lamp
		bodyModel[146] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // lamp
		bodyModel[147] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // lamp
		bodyModel[148] = new ModelRendererTurbo(this, 469, 35, textureX, textureY); // Box 96
		bodyModel[149] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 53
		bodyModel[150] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 53
		bodyModel[151] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 53
		bodyModel[152] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 53
		bodyModel[153] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 53
		bodyModel[154] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 53
		bodyModel[155] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[156] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[157] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[158] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[159] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[160] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[161] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[162] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[163] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[164] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[165] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[166] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[167] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 1
		bodyModel[168] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[169] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 23
		bodyModel[170] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 29
		bodyModel[171] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 30
		bodyModel[172] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 31
		bodyModel[173] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 32
		bodyModel[174] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 33
		bodyModel[175] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 34
		bodyModel[176] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 36
		bodyModel[177] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 37
		bodyModel[178] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 39
		bodyModel[180] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 40
		bodyModel[181] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 41
		bodyModel[182] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 42
		bodyModel[183] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bodyModel[184] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		bodyModel[185] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 47
		bodyModel[186] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 48
		bodyModel[187] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 49
		bodyModel[188] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[189] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 51
		bodyModel[190] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		bodyModel[191] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 53
		bodyModel[192] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 54
		bodyModel[193] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 55
		bodyModel[194] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 92
		bodyModel[195] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 93
		bodyModel[196] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 97
		bodyModel[197] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[198] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[199] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 50
		bodyModel[200] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 57
		bodyModel[201] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 57
		bodyModel[202] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 57
		bodyModel[203] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 57
		bodyModel[204] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 57
		bodyModel[205] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 57
		bodyModel[206] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 57
		bodyModel[207] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 57
		bodyModel[208] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 57
		bodyModel[209] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 57
		bodyModel[210] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 57
		bodyModel[211] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 57
		bodyModel[212] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 57
		bodyModel[213] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 57
		bodyModel[214] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 57
		bodyModel[215] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 57
		bodyModel[216] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 57
		bodyModel[217] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 57
		bodyModel[218] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 57
		bodyModel[219] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 57
		bodyModel[220] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 57
		bodyModel[221] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 57
		bodyModel[222] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 57
		bodyModel[223] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 57
		bodyModel[224] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[225] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[226] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[227] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[228] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 125
		bodyModel[229] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 66
		bodyModel[230] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 66
		bodyModel[231] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 66
		bodyModel[232] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 66
		bodyModel[233] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 125
		bodyModel[234] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 125
		bodyModel[235] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 125
		bodyModel[236] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 66
		bodyModel[237] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 66
		bodyModel[238] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 66
		bodyModel[239] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 66
		bodyModel[240] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 125
		bodyModel[241] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 125
		bodyModel[242] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[243] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[244] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[245] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[246] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[247] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[248] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[249] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[250] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[251] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[252] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		bodyModel[253] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 35
		bodyModel[254] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 66
		bodyModel[255] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 67
		bodyModel[256] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 66
		bodyModel[257] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 67
		bodyModel[258] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 53
		bodyModel[259] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 53
		bodyModel[260] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 53
		bodyModel[261] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[262] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 26
		bodyModel[263] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 26
		bodyModel[264] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 26
		bodyModel[265] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 26
		bodyModel[266] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 26
		bodyModel[267] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 26
		bodyModel[268] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 26
		bodyModel[269] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 26
		bodyModel[270] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 26
		bodyModel[271] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 26
		bodyModel[272] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 26
		bodyModel[273] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 26
		bodyModel[274] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 26
		bodyModel[275] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 26
		bodyModel[276] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 26
		bodyModel[277] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 26
		bodyModel[278] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 26
		bodyModel[279] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 26
		bodyModel[280] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 26
		bodyModel[281] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 26
		bodyModel[282] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 26
		bodyModel[283] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 26
		bodyModel[284] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 26
		bodyModel[285] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 26
		bodyModel[286] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 26
		bodyModel[287] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 26
		bodyModel[288] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 26
		bodyModel[289] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 26
		bodyModel[290] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 26
		bodyModel[291] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 26
		bodyModel[292] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 26
		bodyModel[293] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 26
		bodyModel[294] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 26
		bodyModel[295] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 26
		bodyModel[296] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 26
		bodyModel[297] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 26
		bodyModel[298] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 26
		bodyModel[299] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 26
		bodyModel[300] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 26
		bodyModel[301] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 26
		bodyModel[302] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 26
		bodyModel[303] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 26
		bodyModel[304] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 102
		bodyModel[305] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 102
		bodyModel[306] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 102
		bodyModel[307] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 102
		bodyModel[308] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 182
		bodyModel[309] = new ModelRendererTurbo(this, 367, 136, textureX, textureY); // Box 182
		bodyModel[310] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 23
		bodyModel[311] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 23
		bodyModel[312] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 23
		bodyModel[313] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 23
		bodyModel[314] = new ModelRendererTurbo(this, 73, 152, textureX, textureY); // Handlebars
		bodyModel[315] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Handlebars
		bodyModel[316] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Handlebars
		bodyModel[317] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Handlebars
		bodyModel[318] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Handlebars
		bodyModel[319] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 26
		bodyModel[320] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 26
		bodyModel[321] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 26
		bodyModel[322] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 26
		bodyModel[323] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 26
		bodyModel[324] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 26
		bodyModel[325] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 26
		bodyModel[326] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 26
		bodyModel[327] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 26
		bodyModel[328] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 26
		bodyModel[329] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 26
		bodyModel[330] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 26
		bodyModel[331] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 26
		bodyModel[332] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 26
		bodyModel[333] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // orange things
		bodyModel[334] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // orange things
		bodyModel[335] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // orange things
		bodyModel[336] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Orange things
		bodyModel[337] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Orange things
		bodyModel[338] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Orange things
		bodyModel[339] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 0
		bodyModel[340] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 0
		bodyModel[341] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 0
		bodyModel[342] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 1
		bodyModel[343] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 0
		bodyModel[346] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 1
		bodyModel[347] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 0
		bodyModel[351] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 1, 176, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 1
		bodyModel[354] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 1
		bodyModel[355] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 1
		bodyModel[356] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 1
		bodyModel[357] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 1
		bodyModel[358] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 1
		bodyModel[359] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 1
		bodyModel[360] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 1
		bodyModel[361] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 1
		bodyModel[362] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 1
		bodyModel[363] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 1
		bodyModel[364] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 1
		bodyModel[365] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 1
		bodyModel[366] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // nose
		bodyModel[367] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // lamp
		bodyModel[368] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[369] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[370] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[371] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[372] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 269
		bodyModel[373] = new ModelRendererTurbo(this, 377, 148, textureX, textureY); // Box 269
		bodyModel[374] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[375] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[376] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[377] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[378] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[379] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[380] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[381] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[382] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[383] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[384] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[385] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[386] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 269
		bodyModel[387] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 262
		bodyModel[388] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 269
		bodyModel[389] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 269
		bodyModel[390] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 269
		bodyModel[391] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 269
		bodyModel[392] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 262
		bodyModel[393] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 269
		bodyModel[394] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[395] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[396] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[397] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[398] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 269
		bodyModel[399] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 269
		bodyModel[400] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[401] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[402] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[403] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // lamp
		bodyModel[404] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[405] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[406] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[407] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[408] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[409] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[410] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[411] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // lamp
		bodyModel[412] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 269
		bodyModel[413] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 262
		bodyModel[414] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 269
		bodyModel[415] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 269
		bodyModel[416] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 269
		bodyModel[417] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 269
		bodyModel[418] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 262
		bodyModel[419] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 269
		bodyModel[420] = new ModelRendererTurbo(this, 368, 136, textureX, textureY); // Box 182
		bodyModel[421] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 182
		bodyModel[422] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // corners
		bodyModel[423] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // corners
		bodyModel[424] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // corners
		bodyModel[425] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // corners
		bodyModel[426] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // corners
		bodyModel[427] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // corners
		bodyModel[428] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 26
		bodyModel[429] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[430] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[431] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[432] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[433] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[434] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[435] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // lamp
		bodyModel[436] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // lamp
		bodyModel[437] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // lamp
		bodyModel[438] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // lamp
		bodyModel[439] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // lamp
		bodyModel[440] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 155
		bodyModel[441] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 155
		bodyModel[442] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 155
		bodyModel[443] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 155
		bodyModel[444] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 155
		bodyModel[445] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 155
		bodyModel[446] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 155
		bodyModel[447] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 155
		bodyModel[448] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 155
		bodyModel[449] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 155
		bodyModel[450] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 155
		bodyModel[451] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 155
		bodyModel[452] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 155
		bodyModel[453] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 155
		bodyModel[454] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 155
		bodyModel[455] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 155
		bodyModel[456] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 155
		bodyModel[457] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 155
		bodyModel[458] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 155
		bodyModel[459] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 155
		bodyModel[460] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 155
		bodyModel[461] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 155
		bodyModel[462] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 155
		bodyModel[463] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 155
		bodyModel[464] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 155
		bodyModel[465] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 155
		bodyModel[466] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 155
		bodyModel[467] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 155
		bodyModel[468] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 155
		bodyModel[469] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 155
		bodyModel[470] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 155
		bodyModel[471] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 155
		bodyModel[472] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 102
		bodyModel[473] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 102
		bodyModel[474] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 102
		bodyModel[475] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 102
		bodyModel[476] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 102
		bodyModel[477] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 102
		bodyModel[478] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[479] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[480] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[481] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[482] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 102
		bodyModel[483] = new ModelRendererTurbo(this, 234, 175, textureX, textureY); // Box 96
		bodyModel[484] = new ModelRendererTurbo(this, 234, 175, textureX, textureY); // Box 96
		bodyModel[485] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // nose
		bodyModel[486] = new ModelRendererTurbo(this, 217, 165, textureX, textureY); // lamp
		bodyModel[487] = new ModelRendererTurbo(this, 233, 165, textureX, textureY); // lamp
		bodyModel[488] = new ModelRendererTurbo(this, 449, 159, textureX, textureY); // lamp
		bodyModel[489] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 26
		bodyModel[490] = new ModelRendererTurbo(this, 73, 152, textureX, textureY); // Handlebars
		bodyModel[491] = new ModelRendererTurbo(this, 417, 156, textureX, textureY); // lamp
		bodyModel[492] = new ModelRendererTurbo(this, 417, 156, textureX, textureY); // lamp
		bodyModel[493] = new ModelRendererTurbo(this, 404, 195, textureX, textureY); // Box 26
		bodyModel[494] = new ModelRendererTurbo(this, 449, 163, textureX, textureY); // lamp
		bodyModel[495] = new ModelRendererTurbo(this, 106, 157, textureX, textureY); // Box 1
		bodyModel[496] = new ModelRendererTurbo(this, 225, 67, textureX, textureY); // lamp
		bodyModel[497] = new ModelRendererTurbo(this, 73, 196, textureX, textureY); // wire
		bodyModel[498] = new ModelRendererTurbo(this, 77, 206, textureX, textureY); // wire
		bodyModel[499] = new ModelRendererTurbo(this, 73, 196, textureX, textureY); // wire

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[0].setRotationPoint(-34F, 1.5F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 1
		bodyModel[1].setRotationPoint(-12.5F, 6.5F, -8.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 22
		bodyModel[2].setRotationPoint(-19.5F, 4.5F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 23
		bodyModel[3].setRotationPoint(-20F, 1.5F, -2.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[4].setRotationPoint(-28.5F, 3.5F, 7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[5].setRotationPoint(-28.5F, 3.5F, 7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[6].setRotationPoint(-28.5F, 5.25F, 7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[7].setRotationPoint(-28.5F, 5.25F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[8].setRotationPoint(-28.5F, 3.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[9].setRotationPoint(-28.5F, 3.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[10].setRotationPoint(-13F, 6F, 7.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 37
		bodyModel[11].setRotationPoint(-13F, 7F, 7.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[12].setRotationPoint(-12F, 7F, 7.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[13].setRotationPoint(-12F, 6F, 7.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[14].setRotationPoint(-12F, 7F, -9.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[15].setRotationPoint(-12F, 6F, -9.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[16].setRotationPoint(-13F, 6F, -9.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 43
		bodyModel[17].setRotationPoint(-13F, 7F, -9.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[18].setRotationPoint(-24F, 7F, 7.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[19].setRotationPoint(-24F, 6F, 7.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[20].setRotationPoint(-25F, 6F, 7.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 49
		bodyModel[21].setRotationPoint(-25F, 7F, 7.25F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[22].setRotationPoint(-27F, 4F, 5.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 51
		bodyModel[23].setRotationPoint(-24.5F, 6.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[24].setRotationPoint(-24F, 6F, -9.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[25].setRotationPoint(-25F, 6F, -9.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 54
		bodyModel[26].setRotationPoint(-25F, 7F, -9.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[27].setRotationPoint(-24F, 7F, -9.75F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 92
		bodyModel[28].setRotationPoint(-7.5F, 3.5F, -9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 93
		bodyModel[29].setRotationPoint(-29.5F, 3.5F, -9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 21, 2, 10, 0F); // Box 97
		bodyModel[30].setRotationPoint(-28.5F, 6.25F, -5.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[31].setRotationPoint(-15F, 4F, 5.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[32].setRotationPoint(-27F, 4F, -6.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[33].setRotationPoint(-15F, 4F, -6.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 56
		bodyModel[34].setRotationPoint(-6F, 2.5F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 35
		bodyModel[35].setRotationPoint(1F, 2.5F, -9.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 35
		bodyModel[36].setRotationPoint(1F, 1.5F, -8.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 35
		bodyModel[37].setRotationPoint(1F, 4.5F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[38].setRotationPoint(1F, 1.5F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[39].setRotationPoint(1F, 1.5F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[40].setRotationPoint(1F, 4.5F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[41].setRotationPoint(1F, 4.5F, -6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, -0.5F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(-30.5F, 8.5F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 67
		bodyModel[43].setRotationPoint(-29.5F, 7.5F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, -0.5F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F); // Box 66
		bodyModel[44].setRotationPoint(-30.5F, 8.5F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 67
		bodyModel[45].setRotationPoint(-29.5F, 7.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[46].setRotationPoint(-10F, 5.5F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[47].setRotationPoint(-11F, 7.5F, -9.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[48].setRotationPoint(-12F, 5.5F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[49].setRotationPoint(-15F, 5.5F, -9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-14F, 7.5F, -9.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[51].setRotationPoint(-14F, 5.5F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[52].setRotationPoint(-10F, 5.5F, 7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[53].setRotationPoint(-11F, 7.5F, 7.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[54].setRotationPoint(-12F, 5.5F, 7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-15F, 5.5F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[56].setRotationPoint(-14F, 7.5F, 7.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[57].setRotationPoint(-14F, 5.5F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[58].setRotationPoint(-22F, 5.5F, -9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[59].setRotationPoint(-23F, 7.5F, -9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[60].setRotationPoint(-24F, 5.5F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[61].setRotationPoint(-27F, 5.5F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[62].setRotationPoint(-26F, 7.5F, -9.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[63].setRotationPoint(-26F, 5.5F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[64].setRotationPoint(-22F, 5.5F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[65].setRotationPoint(-23F, 7.5F, 7.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[66].setRotationPoint(-26F, 5.5F, 7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[67].setRotationPoint(-27F, 5.5F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[68].setRotationPoint(-26F, 7.5F, 7.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[69].setRotationPoint(-24F, 5.5F, 7.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 35
		bodyModel[70].setRotationPoint(1F, 2.5F, 5.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 35
		bodyModel[71].setRotationPoint(1F, 1.5F, 6.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 35
		bodyModel[72].setRotationPoint(1F, 4.5F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[73].setRotationPoint(1F, 1.5F, 5.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[74].setRotationPoint(1F, 1.5F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[75].setRotationPoint(1F, 4.5F, 5.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[76].setRotationPoint(1F, 4.5F, 8.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 19, 0F); // Box 35
		bodyModel[77].setRotationPoint(4F, 2.5F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[78].setRotationPoint(-29F, 2.5F, 7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[79].setRotationPoint(-29F, 2.5F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[80].setRotationPoint(-29F, 3.5F, 7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[81].setRotationPoint(-29F, 3.5F, 8.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[82].setRotationPoint(-19.5F, 7.5F, 7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 66
		bodyModel[83].setRotationPoint(-8.5F, 6.5F, 7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F); // Box 66
		bodyModel[84].setRotationPoint(-21.5F, 7.5F, 7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[85].setRotationPoint(-16.5F, 7.5F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[86].setRotationPoint(-28.5F, 6.5F, 7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[87].setRotationPoint(-20F, 5.5F, 7.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[88].setRotationPoint(-17F, 5.5F, 7.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[89].setRotationPoint(-19.5F, 7.5F, -9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 66
		bodyModel[90].setRotationPoint(-8.5F, 6.5F, -9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F); // Box 66
		bodyModel[91].setRotationPoint(-21.5F, 7.5F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[92].setRotationPoint(-16.5F, 7.5F, -9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[93].setRotationPoint(-28.5F, 6.5F, -9.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[94].setRotationPoint(-20F, 5.5F, -9.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[95].setRotationPoint(-17F, 5.5F, -9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-36F, 2.5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(-36F, 2.5F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-36F, 3.5F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[99].setRotationPoint(-36F, 3.5F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-36F, 2.5F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(-36F, 2.5F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(-36F, 3.5F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[103].setRotationPoint(-36F, 3.5F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[104].setRotationPoint(34F, 2.5F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(34F, 2.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(34F, 3.5F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[107].setRotationPoint(34F, 3.5F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(34F, 2.5F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(34F, 2.5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(34F, 3.5F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[111].setRotationPoint(34F, 3.5F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[112].setRotationPoint(-37F, 1.5F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[113].setRotationPoint(-35F, 1.5F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[114].setRotationPoint(-36F, 2.5F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[115].setRotationPoint(-37F, 1.5F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[116].setRotationPoint(-37F, 2.5F, -0.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 125
		bodyModel[117].setRotationPoint(-35F, 1.5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[118].setRotationPoint(34F, 1.5F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[119].setRotationPoint(34F, 2.5F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[120].setRotationPoint(36F, 2.5F, -0.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 125
		bodyModel[121].setRotationPoint(35F, 1.5F, -1.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 125
		bodyModel[122].setRotationPoint(-38F, 3.5F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[123].setRotationPoint(-37F, 1.5F, -1.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 125
		bodyModel[124].setRotationPoint(34F, 3.5F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[125].setRotationPoint(37F, 1.5F, -1.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 125
		bodyModel[126].setRotationPoint(34F, 2.5F, -3F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 125
		bodyModel[127].setRotationPoint(-37F, 2.5F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 66, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 26
		bodyModel[128].setRotationPoint(-33F, 0.5F, -10.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 50, 16, 14, 0F); // Box 26
		bodyModel[129].setRotationPoint(-19F, -15.5F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[130].setRotationPoint(31F, -15.5F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 48, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[131].setRotationPoint(-19F, -19.5F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[132].setRotationPoint(-19F, -20.5F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 48, 4, 3, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[133].setRotationPoint(-19F, -19.5F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[134].setRotationPoint(-19F, -20.5F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[135].setRotationPoint(28F, -18.5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 96
		bodyModel[136].setRotationPoint(30F, -18.5F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -1F, 1F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 96
		bodyModel[137].setRotationPoint(30F, -18.5F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[138].setRotationPoint(29F, -20.5F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[139].setRotationPoint(28F, -19.5F, -6F);

		bodyModel[140].addBox(0F, 0F, 0F, 47, 4, 8, 0F); // Box 96
		bodyModel[140].setRotationPoint(-19F, -19.5F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 116
		bodyModel[141].setRotationPoint(-35F, -9F, -5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 116
		bodyModel[142].setRotationPoint(31F, -12.5F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // lamp
		bodyModel[143].setRotationPoint(-34.5F, -2.5F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // lamp
		bodyModel[144].setRotationPoint(-34.5F, -2.5F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // lamp
		bodyModel[145].setRotationPoint(31F, -11F, 4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F); // lamp
		bodyModel[146].setRotationPoint(31F, -11F, -5.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[147].setRotationPoint(-34.51F, -2F, -0.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -3F, 0.375F, 0F, -3F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[148].setRotationPoint(29F, -20.5F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[149].setRotationPoint(-34F, 1.5F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[150].setRotationPoint(-34F, 1.5F, 9.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[151].setRotationPoint(33F, 1.5F, -10.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[152].setRotationPoint(33F, 1.5F, 9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[153].setRotationPoint(-33F, 1.5F, -10.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[154].setRotationPoint(-33F, 1.5F, 9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[155].setRotationPoint(-12F, 2.5F, 7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[156].setRotationPoint(-12F, 2.5F, 8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[157].setRotationPoint(-12F, 3.5F, 7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[158].setRotationPoint(-12F, 3.5F, 8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[159].setRotationPoint(-29F, 2.5F, -10.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[160].setRotationPoint(-29F, 2.5F, -9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[161].setRotationPoint(-29F, 3.5F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[162].setRotationPoint(-29F, 3.5F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[163].setRotationPoint(-12F, 2.5F, -10.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[164].setRotationPoint(-12F, 2.5F, -9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[165].setRotationPoint(-12F, 3.5F, -10.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[166].setRotationPoint(-12F, 3.5F, -9.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 1
		bodyModel[167].setRotationPoint(22.5F, 6.5F, -8.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 4, 16, 0F); // Box 22
		bodyModel[168].setRotationPoint(15.5F, 4.5F, -8.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 23
		bodyModel[169].setRotationPoint(15F, 1.5F, -2.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[170].setRotationPoint(6.5F, 3.5F, 7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[171].setRotationPoint(6.5F, 3.5F, 7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 31
		bodyModel[172].setRotationPoint(6.5F, 5.25F, 7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		bodyModel[173].setRotationPoint(6.5F, 5.25F, -9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[174].setRotationPoint(6.5F, 3.5F, -9.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		bodyModel[175].setRotationPoint(6.5F, 3.5F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[176].setRotationPoint(22F, 6F, 7.25F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 37
		bodyModel[177].setRotationPoint(22F, 7F, 7.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[178].setRotationPoint(23F, 7F, 7.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[179].setRotationPoint(23F, 6F, 7.25F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[180].setRotationPoint(23F, 7F, -9.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[181].setRotationPoint(23F, 6F, -9.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[182].setRotationPoint(22F, 6F, -9.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 43
		bodyModel[183].setRotationPoint(22F, 7F, -9.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[184].setRotationPoint(11F, 7F, 7.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[185].setRotationPoint(11F, 6F, 7.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[186].setRotationPoint(10F, 6F, 7.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 49
		bodyModel[187].setRotationPoint(10F, 7F, 7.25F);

		bodyModel[188].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[188].setRotationPoint(8F, 4F, 5.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 51
		bodyModel[189].setRotationPoint(10.5F, 6.5F, -8.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[190].setRotationPoint(11F, 6F, -9.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[191].setRotationPoint(10F, 6F, -9.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 54
		bodyModel[192].setRotationPoint(10F, 7F, -9.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[193].setRotationPoint(11F, 7F, -9.75F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 92
		bodyModel[194].setRotationPoint(27.5F, 3.5F, -9.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 93
		bodyModel[195].setRotationPoint(5.5F, 3.5F, -9.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 21, 2, 10, 0F); // Box 97
		bodyModel[196].setRotationPoint(6.5F, 6.25F, -5.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[197].setRotationPoint(20F, 4F, 5.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[198].setRotationPoint(8F, 4F, -6.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 50
		bodyModel[199].setRotationPoint(20F, 4F, -6.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[200].setRotationPoint(25F, 5.5F, -9.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[201].setRotationPoint(24F, 7.5F, -9.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[202].setRotationPoint(23F, 5.5F, -9.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[203].setRotationPoint(20F, 5.5F, -9.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[204].setRotationPoint(21F, 7.5F, -9.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[205].setRotationPoint(21F, 5.5F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[206].setRotationPoint(25F, 5.5F, 7.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[207].setRotationPoint(24F, 7.5F, 7.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[208].setRotationPoint(23F, 5.5F, 7.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[209].setRotationPoint(20F, 5.5F, 7.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[210].setRotationPoint(21F, 7.5F, 7.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[211].setRotationPoint(21F, 5.5F, 7.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[212].setRotationPoint(13F, 5.5F, -9.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[213].setRotationPoint(12F, 7.5F, -9.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[214].setRotationPoint(11F, 5.5F, -9.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[215].setRotationPoint(8F, 5.5F, -9.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[216].setRotationPoint(9F, 7.5F, -9.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[217].setRotationPoint(9F, 5.5F, -9.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[218].setRotationPoint(13F, 5.5F, 7.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 57
		bodyModel[219].setRotationPoint(12F, 7.5F, 7.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[220].setRotationPoint(9F, 5.5F, 7.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 57
		bodyModel[221].setRotationPoint(8F, 5.5F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Box 57
		bodyModel[222].setRotationPoint(9F, 7.5F, 7.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 57
		bodyModel[223].setRotationPoint(11F, 5.5F, 7.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[224].setRotationPoint(6F, 2.5F, 7.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[225].setRotationPoint(6F, 2.5F, 8.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[226].setRotationPoint(6F, 3.5F, 7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[227].setRotationPoint(6F, 3.5F, 8.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[228].setRotationPoint(15.5F, 7.5F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 66
		bodyModel[229].setRotationPoint(26.5F, 6.5F, 7.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F); // Box 66
		bodyModel[230].setRotationPoint(13.5F, 7.5F, 7.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[231].setRotationPoint(18.5F, 7.5F, 7.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[232].setRotationPoint(6.5F, 6.5F, 7.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[233].setRotationPoint(15F, 5.5F, 7.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[234].setRotationPoint(18F, 5.5F, 7.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		bodyModel[235].setRotationPoint(15.5F, 7.5F, -9.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 66
		bodyModel[236].setRotationPoint(26.5F, 6.5F, -9.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F); // Box 66
		bodyModel[237].setRotationPoint(13.5F, 7.5F, -9.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[238].setRotationPoint(18.5F, 7.5F, -9.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[239].setRotationPoint(6.5F, 6.5F, -9.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[240].setRotationPoint(15F, 5.5F, -9.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 125
		bodyModel[241].setRotationPoint(18F, 5.5F, -9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[242].setRotationPoint(23F, 2.5F, 7.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[243].setRotationPoint(23F, 2.5F, 8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[244].setRotationPoint(23F, 3.5F, 7.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[245].setRotationPoint(23F, 3.5F, 8.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[246].setRotationPoint(6F, 2.5F, -10.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[247].setRotationPoint(6F, 2.5F, -9.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[248].setRotationPoint(6F, 3.5F, -10.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[249].setRotationPoint(6F, 3.5F, -9.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[250].setRotationPoint(23F, 2.5F, -10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[251].setRotationPoint(23F, 2.5F, -9.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[252].setRotationPoint(23F, 3.5F, -10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[253].setRotationPoint(23F, 3.5F, -9.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[254].setRotationPoint(28.5F, 8.5F, 5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 67
		bodyModel[255].setRotationPoint(27.5F, 7.5F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[256].setRotationPoint(28.5F, 8.5F, -7F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 67
		bodyModel[257].setRotationPoint(27.5F, 7.5F, -7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 53
		bodyModel[258].setRotationPoint(30F, 1.5F, -9.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 53
		bodyModel[259].setRotationPoint(30F, 1.5F, -10.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F); // Box 53
		bodyModel[260].setRotationPoint(30F, 1.5F, 9.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[261].setRotationPoint(36F, 1.5F, -0.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[262].setRotationPoint(-34F, -9.5F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[263].setRotationPoint(-34F, -15.5F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[264].setRotationPoint(-34F, -16.5F, -10.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.25F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 26
		bodyModel[265].setRotationPoint(-34F, -17.25F, -10.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 26
		bodyModel[266].setRotationPoint(-34F, -18F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[267].setRotationPoint(-34F, -19.5F, -6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[268].setRotationPoint(-34F, -20.5F, -3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[269].setRotationPoint(-28F, -9.5F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[270].setRotationPoint(-34F, -15.5F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,-0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[271].setRotationPoint(-34F, -18F, 6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,-0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[272].setRotationPoint(-34F, -19.5F, 3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[273].setRotationPoint(-34F, -9.5F, 9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[274].setRotationPoint(-34F, -9.5F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 26
		bodyModel[275].setRotationPoint(-34F, -18F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[276].setRotationPoint(-34F, -19F, 3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[277].setRotationPoint(-34F, -19F, -6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[278].setRotationPoint(-20F, -9.5F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[279].setRotationPoint(-20F, -9.5F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[280].setRotationPoint(-20F, -18F, -9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[281].setRotationPoint(-20F, -18F, 6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[282].setRotationPoint(-20F, -19F, 3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[283].setRotationPoint(-20F, -19F, -6F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[284].setRotationPoint(-34F, -16.5F, 9.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.75F, -1.25F, -0.25F, 0.75F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 26
		bodyModel[285].setRotationPoint(-34F, -17.25F, 9.25F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 10, 18, 0F); // Box 26
		bodyModel[286].setRotationPoint(-34F, -9.5F, -9F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 26
		bodyModel[287].setRotationPoint(-34F, -19.5F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 26
		bodyModel[288].setRotationPoint(-34F, -18.5F, -6F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 26
		bodyModel[289].setRotationPoint(-34F, -18F, 6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 26
		bodyModel[290].setRotationPoint(-34F, -18.5F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[291].setRotationPoint(-26F, -15.5F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[292].setRotationPoint(-28F, -15.5F, 10F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 10, 18, 0F); // Box 26
		bodyModel[293].setRotationPoint(-20F, -9.5F, -9F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // Box 26
		bodyModel[294].setRotationPoint(-20F, -18.5F, -6F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 26
		bodyModel[295].setRotationPoint(-20F, -19.5F, -3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[296].setRotationPoint(-20F, -17.5F, -7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[297].setRotationPoint(-20F, -17.5F, 6F);

		bodyModel[298].addBox(0F, 0F, 0F, 7, 10, 4, 0F); // Box 26
		bodyModel[298].setRotationPoint(-19F, -9.5F, -11F);

		bodyModel[299].addBox(0F, 0F, 0F, 7, 10, 4, 0F); // Box 26
		bodyModel[299].setRotationPoint(-19F, -9.5F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[300].setRotationPoint(-20F, -9.5F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[301].setRotationPoint(-34F, -9.5F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[302].setRotationPoint(-20F, -15.5F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[303].setRotationPoint(-20F, -15.5F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		bodyModel[304].setRotationPoint(-33F, -9.5F, 10.25F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 102
		bodyModel[305].setRotationPoint(-33F, -15.5F, 10.25F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 102
		bodyModel[306].setRotationPoint(-25F, -9.5F, -11.25F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 102
		bodyModel[307].setRotationPoint(-25F, -15.5F, -11.25F);

		bodyModel[308].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 182
		bodyModel[308].setRotationPoint(-34.01F, -18.5F, -10.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,-0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 182
		bodyModel[309].setRotationPoint(-27.5F, -16F, 10.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 23
		bodyModel[310].setRotationPoint(-24F, 3F, 5.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 23
		bodyModel[311].setRotationPoint(11F, 3F, 5.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 23
		bodyModel[312].setRotationPoint(-24F, 3F, -10.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 23
		bodyModel[313].setRotationPoint(11F, 3F, -10.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Handlebars
		bodyModel[314].setRotationPoint(31.5F, -16.5F, -6.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Handlebars
		bodyModel[315].setRotationPoint(-19.25F, -16.5F, 5.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -1.5F, -0.25F, -1F, 1F, -0.25F, -1F, 1F, -0.25F, 0.75F, -1.5F, -0.25F, 0.75F); // Handlebars
		bodyModel[316].setRotationPoint(29.75F, -16F, 5.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Handlebars
		bodyModel[317].setRotationPoint(-19.25F, -16.5F, -6.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -1.5F, -0.25F, 0.75F, 1F, -0.25F, 0.75F, 1F, -0.25F, -1F, -1.5F, -0.25F, -1F); // Handlebars
		bodyModel[318].setRotationPoint(29.75F, -16F, -6.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[319].setRotationPoint(-23F, -6.5F, 4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[320].setRotationPoint(-23F, -7.5F, 8F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 26
		bodyModel[321].setRotationPoint(-24F, -6.5F, 1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[322].setRotationPoint(-25F, -7.5F, 9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[323].setRotationPoint(-22F, -8.5F, 1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[324].setRotationPoint(-33F, -6.5F, -8F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 26
		bodyModel[325].setRotationPoint(-33F, -7.5F, -9F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 26
		bodyModel[326].setRotationPoint(-33F, -6.5F, -4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[327].setRotationPoint(-33F, -7.5F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[328].setRotationPoint(-33F, -8.5F, -7F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 21, 0F); // Box 26
		bodyModel[329].setRotationPoint(33F, 0.5F, -10.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 1, 21, 0F); // Box 26
		bodyModel[330].setRotationPoint(-34F, 0.5F, -10.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 66, 2, 20, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[331].setRotationPoint(-33F, 0.5F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 26
		bodyModel[332].setRotationPoint(-33F, -7.5F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // orange things
		bodyModel[333].setRotationPoint(-34.5F, 2F, 3.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // orange things
		bodyModel[334].setRotationPoint(-34.5F, 2F, -2.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // orange things
		bodyModel[335].setRotationPoint(-34.5F, 2F, -4.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Orange things
		bodyModel[336].setRotationPoint(33.5F, 2F, -4.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Orange things
		bodyModel[337].setRotationPoint(33.5F, 2F, 1.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Orange things
		bodyModel[338].setRotationPoint(33.5F, 2F, 3.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,4F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.2F, 0F); // Box 0
		bodyModel[339].setRotationPoint(36.5F, 9F, -10.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,3F, 1F, 0F, -3.75F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 4F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[340].setRotationPoint(36.5F, 7F, -10.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,3F, 2F, 0F, -3.5F, 2F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, 3F, -1F, 0F, -3.75F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[341].setRotationPoint(36.5F, 6F, -10.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 1
		bodyModel[342].setRotationPoint(-33.9F, 4F, 7.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0.5F, 0F, 4F, 0.5F, 0F, -1.5F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 0
		bodyModel[343].setRotationPoint(36.5F, 9F, 1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -3.75F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, 4F, -0.5F, 0F); // Box 0
		bodyModel[344].setRotationPoint(36.5F, 7F, 1.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -3.5F, 2F, 0F, 3F, 2F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.75F, -1F, 0F, 3F, -1F, 0F); // Box 0
		bodyModel[345].setRotationPoint(36.5F, 6F, 1.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 1
		bodyModel[346].setRotationPoint(32.75F, 4F, 7.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.5F, 0F, -4.5F, 0.5F, 0F, 1F, 0F, 0F, -1.5F, -0.2F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[347].setRotationPoint(-37.5F, 9F, 1.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 3F, 1F, 0F, -3.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.5F, 0F, -4.5F, -0.5F, 0F); // Box 0
		bodyModel[348].setRotationPoint(-37.5F, 7F, 1.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 3F, 2F, 0F, -3.5F, 2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -1F, 0F, -3.75F, -1F, 0F); // Box 0
		bodyModel[349].setRotationPoint(-37.5F, 6F, 1.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-4.5F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -0.2F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[350].setRotationPoint(-37.5F, 9F, -10.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3.75F, 1F, 0F, 3F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -4.5F, -0.5F, 0F, 4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[351].setRotationPoint(-37.5F, 7F, -10.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-3.5F, 2F, 0F, 3F, 2F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, -3.75F, -1F, 0F, 3F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[352].setRotationPoint(-37.5F, 6F, -10.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 1
		bodyModel[353].setRotationPoint(-33.9F, 4F, -8.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 1
		bodyModel[354].setRotationPoint(32.75F, 4F, -8.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0.5F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2F, 0F, 0.5F, -0.375F, -0.375F, 0.5F); // Box 1
		bodyModel[355].setRotationPoint(34.5F, 5.5F, -2F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.375F, -0.375F, 0F); // Box 1
		bodyModel[356].setRotationPoint(34.5F, 5.5F, -0.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, -0.5F, 0.5F, -0.375F, -0.125F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[357].setRotationPoint(34.5F, 8F, -2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.375F, -0.125F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.375F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[358].setRotationPoint(34.5F, 8F, -0.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.375F, -0.125F, 0.5F, -2F, -0.5F, 0.5F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1.5F, 0.5F, 0F, 0F); // Box 1
		bodyModel[359].setRotationPoint(34.5F, 8F, 1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, -0.375F, -0.375F, 0.5F, -2F, 0F, 0.5F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 1
		bodyModel[360].setRotationPoint(34.5F, 5.5F, 1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[361].setRotationPoint(-37.5F, 5.5F, -0.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-2F, -0.5F, 0.5F, -0.375F, -0.125F, 0.5F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, -1.5F); // Box 1
		bodyModel[362].setRotationPoint(-38.5F, 8F, 1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, -0.5F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[363].setRotationPoint(-37.5F, 8F, -0.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.375F, -0.125F, 0.5F, -2F, -0.5F, 0.5F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 1
		bodyModel[364].setRotationPoint(-38.5F, 8F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.375F, -0.375F, 0.5F, -2F, 0F, 0.5F); // Box 1
		bodyModel[365].setRotationPoint(-38.5F, 5.5F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // nose
		bodyModel[366].setRotationPoint(-34.5F, -4F, -0.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[367].setRotationPoint(-34.5F, -17F, -0.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // lamp
		bodyModel[368].setRotationPoint(33.15F, -1.25F, 6.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[369].setRotationPoint(33.15F, -1.25F, 5.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // lamp
		bodyModel[370].setRotationPoint(33.15F, -0.25F, 5.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // lamp
		bodyModel[371].setRotationPoint(33.15F, -0.25F, 6.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[372].setRotationPoint(33.05F, -2F, 9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[373].setRotationPoint(33.05F, -2F, 6F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[374].setRotationPoint(33.15F, -1.25F, -7.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // lamp
		bodyModel[375].setRotationPoint(33.15F, -1.25F, -6.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // lamp
		bodyModel[376].setRotationPoint(33.15F, -0.25F, -6.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // lamp
		bodyModel[377].setRotationPoint(33.15F, -0.25F, -7.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[378].setRotationPoint(33.25F, -1.45F, 7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // lamp
		bodyModel[379].setRotationPoint(33.25F, -1.45F, 8.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F); // lamp
		bodyModel[380].setRotationPoint(33.25F, -0.45F, 7.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F); // lamp
		bodyModel[381].setRotationPoint(33.25F, -0.45F, 8.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F); // lamp
		bodyModel[382].setRotationPoint(33.25F, -1.45F, -9.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // lamp
		bodyModel[383].setRotationPoint(33.25F, -1.45F, -8.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F); // lamp
		bodyModel[384].setRotationPoint(33.25F, -0.45F, -9.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F); // lamp
		bodyModel[385].setRotationPoint(33.25F, -0.45F, -8.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[386].setRotationPoint(33.05F, -1F, 5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[387].setRotationPoint(33.05F, -1F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[388].setRotationPoint(33.05F, -2F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[389].setRotationPoint(33.05F, -2F, -9F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 269
		bodyModel[390].setRotationPoint(33.05F, -1F, -6F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 269
		bodyModel[391].setRotationPoint(33.05F, 0F, -6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 262
		bodyModel[392].setRotationPoint(33.05F, -1F, 6F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 269
		bodyModel[393].setRotationPoint(33.05F, 0F, 5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[394].setRotationPoint(-35F, -1.25F, -7.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // lamp
		bodyModel[395].setRotationPoint(-35F, -1.25F, -6.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // lamp
		bodyModel[396].setRotationPoint(-35F, -0.25F, -6.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // lamp
		bodyModel[397].setRotationPoint(-35F, -0.25F, -7.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[398].setRotationPoint(-34.9F, -2F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[399].setRotationPoint(-34.9F, -2F, -9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // lamp
		bodyModel[400].setRotationPoint(-35F, -1.25F, 6.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[401].setRotationPoint(-35F, -1.25F, 5.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // lamp
		bodyModel[402].setRotationPoint(-35F, -0.25F, 5.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // lamp
		bodyModel[403].setRotationPoint(-35F, -0.25F, 6.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // lamp
		bodyModel[404].setRotationPoint(-35.1F, -1.45F, -8.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[405].setRotationPoint(-35.1F, -1.45F, -9.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // lamp
		bodyModel[406].setRotationPoint(-35.1F, -0.45F, -8.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // lamp
		bodyModel[407].setRotationPoint(-35.1F, -0.45F, -9.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // lamp
		bodyModel[408].setRotationPoint(-35.1F, -1.45F, 8.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[409].setRotationPoint(-35.1F, -1.45F, 7.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // lamp
		bodyModel[410].setRotationPoint(-35.1F, -0.45F, 8.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // lamp
		bodyModel[411].setRotationPoint(-35.1F, -0.45F, 7.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 269
		bodyModel[412].setRotationPoint(-34.9F, -1F, -6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F); // Box 262
		bodyModel[413].setRotationPoint(-34.9F, -1F, 6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[414].setRotationPoint(-34.9F, -2F, 9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[415].setRotationPoint(-34.9F, -2F, 6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[416].setRotationPoint(-34.9F, -1F, 5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 269
		bodyModel[417].setRotationPoint(-34.9F, 0F, 5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[418].setRotationPoint(-34.9F, -1F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 269
		bodyModel[419].setRotationPoint(-34.9F, 0F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,-0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F); // Box 182
		bodyModel[420].setRotationPoint(-33.5F, -16F, -10.5F);

		bodyModel[421].addBox(0F, 0F, 0F, 0, 8, 21, 0F); // Box 182
		bodyModel[421].setRotationPoint(-19.5F, -17F, -10.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // corners
		bodyModel[422].setRotationPoint(-34F, -17.75F, 2.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // corners
		bodyModel[423].setRotationPoint(-34F, -10F, 2.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // corners
		bodyModel[424].setRotationPoint(-34F, -17.75F, -3.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // corners
		bodyModel[425].setRotationPoint(-34F, -10F, -3.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // corners
		bodyModel[426].setRotationPoint(-34F, -10F, 10F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // corners
		bodyModel[427].setRotationPoint(-34F, -10F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 26
		bodyModel[428].setRotationPoint(-31F, -8.5F, -1F);

		bodyModel[429].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[429].setRotationPoint(0.5F, -8F, -7.05F);

		bodyModel[430].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[430].setRotationPoint(2.5F, -8F, 7.05F);

		bodyModel[431].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[431].setRotationPoint(4.5F, -8F, -7.05F);

		bodyModel[432].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[432].setRotationPoint(6.5F, -8F, 7.05F);

		bodyModel[433].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[433].setRotationPoint(21.5F, -8F, -7.05F);

		bodyModel[434].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[434].setRotationPoint(23.5F, -8F, 7.05F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[435].setRotationPoint(-34.5F, -7F, 6.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[436].setRotationPoint(-34.5F, -7F, -7.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[437].setRotationPoint(31.5F, -7F, 4.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[438].setRotationPoint(31.5F, -7F, -5.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[439].setRotationPoint(31.5F, -7F, -0.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[440].setRotationPoint(-34.5F, -4F, -7F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[441].setRotationPoint(-34.5F, -4F, -9F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[442].setRotationPoint(-34.5F, -2F, -7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[443].setRotationPoint(-34.5F, -2F, -9F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[444].setRotationPoint(-34.5F, -4F, 0F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[445].setRotationPoint(-34.5F, -4F, -2F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[446].setRotationPoint(-34.5F, -2F, 0F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[447].setRotationPoint(-34.5F, -2F, -2F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[448].setRotationPoint(-34.5F, -4F, 7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[449].setRotationPoint(-34.5F, -4F, 5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[450].setRotationPoint(-34.5F, -2F, 7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[451].setRotationPoint(-34.5F, -2F, 5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[452].setRotationPoint(-34.5F, -13F, 0F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[453].setRotationPoint(-34.5F, -13F, -2F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[454].setRotationPoint(-34.5F, -11F, 0F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[455].setRotationPoint(-34.5F, -11F, -2F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[456].setRotationPoint(31.75F, -4F, -5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[457].setRotationPoint(31.75F, -4F, -7F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[458].setRotationPoint(31.75F, -2F, -5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[459].setRotationPoint(31.75F, -2F, -7F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[460].setRotationPoint(32F, -4F, 0F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[461].setRotationPoint(32F, -4F, -2F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[462].setRotationPoint(32F, -2F, 0F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[463].setRotationPoint(32F, -2F, -2F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[464].setRotationPoint(31.75F, -4F, 5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[465].setRotationPoint(31.75F, -4F, 3F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[466].setRotationPoint(31.75F, -2F, 5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[467].setRotationPoint(31.75F, -2F, 3F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[468].setRotationPoint(31.25F, -13F, 0F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[469].setRotationPoint(31.25F, -13F, -2F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[470].setRotationPoint(31.25F, -11F, 0F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[471].setRotationPoint(31.25F, -11F, -2F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
		bodyModel[472].setRotationPoint(-27.5F, -2F, -7F);

		bodyModel[473].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 102
		bodyModel[473].setRotationPoint(-28.5F, -3F, -8F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 102
		bodyModel[474].setRotationPoint(-26.5F, -6F, -8F);

		bodyModel[475].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
		bodyModel[475].setRotationPoint(-26.5F, -2F, 6F);

		bodyModel[476].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 102
		bodyModel[476].setRotationPoint(-27.5F, -3F, 5F);

		bodyModel[477].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 102
		bodyModel[477].setRotationPoint(-27.5F, -6F, 5F);

		bodyModel[478].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[478].setRotationPoint(8.5F, -8F, -7.05F);

		bodyModel[479].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[479].setRotationPoint(10.5F, -8F, 7.05F);

		bodyModel[480].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[480].setRotationPoint(-3.5F, -8F, -7.05F);

		bodyModel[481].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[481].setRotationPoint(-7.5F, -8F, 7.05F);

		bodyModel[482].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 102
		bodyModel[482].setRotationPoint(14.5F, -8F, 7.05F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[483].setRotationPoint(29F, -20.5F, 0F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[484].setRotationPoint(29F, -20.5F, -3F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // nose
		bodyModel[485].setRotationPoint(31.75F, -4F, -0.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // lamp
		bodyModel[486].setRotationPoint(33.5F, 0F, -10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // lamp
		bodyModel[487].setRotationPoint(33.5F, 0F, 6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[488].setRotationPoint(30.5F, -17.25F, -0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 16, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[489].setRotationPoint(31F, -15.5F, -7F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1F, -0.25F, 0F); // Handlebars
		bodyModel[490].setRotationPoint(-35.25F, -12F, -2.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[491].setRotationPoint(-34.5F, -4F, 2.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[492].setRotationPoint(-34.5F, -4F, -3.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 16, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[493].setRotationPoint(31F, -15.5F, 2F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[494].setRotationPoint(32F, -2.5F, 2F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0.5F, -0.375F, -0.375F, 0.5F, 0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 1
		bodyModel[495].setRotationPoint(-38.5F, 5.5F, 1F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[496].setRotationPoint(-34.51F, -2F, -3.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // wire
		bodyModel[497].setRotationPoint(-35.25F, -7.5F, -8.75F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // wire
		bodyModel[498].setRotationPoint(-35.25F, -7.5F, -8.25F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // wire
		bodyModel[499].setRotationPoint(-35.25F, -7.5F, 7.75F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 77, 206, textureX, textureY); // wire
		bodyModel[501] = new ModelRendererTurbo(this, 79, 199, textureX, textureY); // iron
		bodyModel[502] = new ModelRendererTurbo(this, 79, 199, textureX, textureY); // iron
		bodyModel[503] = new ModelRendererTurbo(this, 79, 199, textureX, textureY); // iron
		bodyModel[504] = new ModelRendererTurbo(this, 79, 199, textureX, textureY); // iron
		bodyModel[505] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[506] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[507] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[508] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[509] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[510] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[511] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[512] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[513] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[514] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[516] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[517] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[518] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[519] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[520] = new ModelRendererTurbo(this, 62, 195, textureX, textureY); // Handlebars
		bodyModel[521] = new ModelRendererTurbo(this, 85, 205, textureX, textureY); // Handlebars
		bodyModel[522] = new ModelRendererTurbo(this, 62, 195, textureX, textureY); // Handlebars
		bodyModel[523] = new ModelRendererTurbo(this, 85, 205, textureX, textureY); // Handlebars
		bodyModel[524] = new ModelRendererTurbo(this, 217, 34, textureX, textureY); // lamp
		bodyModel[525] = new ModelRendererTurbo(this, 325, 82, textureX, textureY); // lamp
		bodyModel[526] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[527] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[528] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[529] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[530] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[531] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[532] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp
		bodyModel[533] = new ModelRendererTurbo(this, 449, 215, textureX, textureY); // lamp

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // wire
		bodyModel[500].setRotationPoint(-35.25F, -7.5F, 5.25F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // iron
		bodyModel[501].setRotationPoint(-35F, -7.5F, -7.5F);

		bodyModel[502].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // iron
		bodyModel[502].setRotationPoint(-34.25F, -8.5F, -7.5F);

		bodyModel[503].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // iron
		bodyModel[503].setRotationPoint(-34.25F, -8.5F, 6.5F);

		bodyModel[504].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // iron
		bodyModel[504].setRotationPoint(-35F, -7.5F, 6.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[505].setRotationPoint(-37F, 3.5F, 5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[506].setRotationPoint(-37F, 1.5F, 7F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[507].setRotationPoint(-37F, 3.5F, 7F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[508].setRotationPoint(-37F, 1.5F, -9F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[509].setRotationPoint(-37F, 3.5F, -9F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[510].setRotationPoint(-37F, 1.5F, -7F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[511].setRotationPoint(-37F, 3.5F, -7F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[512].setRotationPoint(36F, 1.5F, 5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[513].setRotationPoint(36F, 3.5F, 5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[514].setRotationPoint(36F, 1.5F, 7F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[515].setRotationPoint(36F, 3.5F, 7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[516].setRotationPoint(36F, 1.5F, -9F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[517].setRotationPoint(36F, 3.5F, -9F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[518].setRotationPoint(36F, 1.5F, -7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 0
		bodyModel[519].setRotationPoint(36F, 3.5F, -7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Handlebars
		bodyModel[520].setRotationPoint(-35.25F, -9.5F, -10.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Handlebars
		bodyModel[521].setRotationPoint(-35.25F, -9.5F, -10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Handlebars
		bodyModel[522].setRotationPoint(-35.25F, -9.5F, 9.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Handlebars
		bodyModel[523].setRotationPoint(-35.25F, -9.5F, 4F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // lamp
		bodyModel[524].setRotationPoint(-34.5F, -9F, -8F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // lamp
		bodyModel[525].setRotationPoint(-34.5F, -9F, 4F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[526].setRotationPoint(31F, -11.25F, -0.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[527].setRotationPoint(32.05F, -1.5F, -0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[528].setRotationPoint(32F, -1.5F, 4.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[529].setRotationPoint(32F, -1.5F, -5.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[530].setRotationPoint(-34.25F, -2.5F, -0.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[531].setRotationPoint(-34.25F, -2.5F, 6.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[532].setRotationPoint(-34.25F, -2.5F, -7.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // lamp
		bodyModel[533].setRotationPoint(-34.25F, -11.5F, -0.5F);
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for (int i = 0; i < 534; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}

}