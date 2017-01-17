package com.rpsg.rpg.controller;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.rpsg.gdxQuery.$;
import com.rpsg.gdxQuery.GdxQuery;
import com.rpsg.rpg.controller.PostController.Status;
import com.rpsg.rpg.core.Game;
import com.rpsg.rpg.core.Path;
import com.rpsg.rpg.core.Res;
import com.rpsg.rpg.core.Views;
import com.rpsg.rpg.view.JSView;

/**
 * GDX-RPG 菜单管理器<br>
 * 负责统一的游戏菜单创建、销毁等工作
 */
public class GameMenuController {
	JSView menu;
	GdxQuery menuButton;
	
	public GameMenuController() {
		//创建stage菜单
		menuButton = $.add(new Button(Res.getDrawable(Path.IMAGE_MENU_GLOBAL + "btn_menu.png"), Res.getDrawable(Path.IMAGE_MENU_GLOBAL + "btn_menu_a.png")))
			.size(60, 60).position(Game.STAGE_WIDTH - 90, 30).click(this::show).to(Game.view.stage);
		
	}
	
	/**显示菜单*/
	public void show() {
		if(menu != null) return;
		menu = JSView.of("view/MenuView.js");
		menu.create();
		Views.addView(menu);
		
		Game.view.post.setStatus(Status.menu, false);
		
		Game.view.stage.unfocusAll();
		menuButton.cleanActions().fadeOut(.2f);
	}
	
	/**关闭菜单*/
	public void hide() {
		menu.remove();
		menu = null;
		
		Game.view.post.setStatus(Status.normal, false);
		menuButton.cleanActions().fadeIn(.2f);
	}
	
	public boolean visible() {
		return menu == null;
	}
	
	public void dispose() {
		hide();
	}
}
