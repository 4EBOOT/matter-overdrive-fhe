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
package matteroverdrive.api.events;

import matteroverdrive.api.android.IAndroid;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * Created by Simeon on 1/9/2016.
 */
public class MOEventAndroid extends PlayerEvent {
    public final IAndroid android;

    public MOEventAndroid(IAndroid android) {
        super(android.getPlayer());
        this.android = android;
    }

    /**
     * Called when the Players star the android transformation.
     * When canceled, transformation never occurs.
     */
    public static class Transformation extends MOEventAndroid {
        public Transformation(IAndroid android) {
            super(android);
        }

        @Override
        public boolean isCancelable() {
            return true;
        }
    }
}
