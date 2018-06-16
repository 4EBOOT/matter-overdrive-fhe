/*
 * This file is part of Matter Overdrive
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */
package matteroverdrive.api.quest;

/**
 * Created by Simeon on 3/1/2016.
 */
public class QuestLogicState {
    private final QuestState.Type type;
    private final boolean showOnHud;

    public QuestLogicState(QuestState.Type type, boolean showOnHud) {
        this.type = type;
        this.showOnHud = showOnHud;
    }

    public QuestState.Type getType() {
        return type;
    }

    public boolean isShowOnHud() {
        return showOnHud;
    }
}
