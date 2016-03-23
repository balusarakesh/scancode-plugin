package org.nexb.plugins.Scancode;

import hudson.Extension;
import hudson.views.ViewsTabBar;
import hudson.views.ViewsTabBarDescriptor;
import net.sf.json.JSONObject;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;


public class ScancodeFirst extends ViewsTabBar {
   
    @DataBoundConstructor
    public ScancodeFirst() {
        super();
    }
    
    @Extension
    public static final class ScancodeFirstDescriptor extends ViewsTabBarDescriptor {

        public ScancodeFirstDescriptor() {
            load();
        }

        @Override
        public String getDisplayName() {
            return "Scancode-toolkit";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            save();
            return false;
        }
    }
}
