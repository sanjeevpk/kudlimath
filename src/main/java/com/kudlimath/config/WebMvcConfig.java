///**
// * © Copyright SanSys Pvt. Ltd. All rights reserved. SanSys is a registered trademark and the SanSys graphic logo is a trademark of SanSys Pvt. Ltd.
// * SanSys reserves all the right for this source code. You should not modify or reuse without the noticing it to SanSys. And need to provide 
// * credits where applicable. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an 
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *
// * See the License for the specific governing permissions and
// * limitations under the License.
// *
// * @author - Sanjeev
// * @version - 1.0
// * @CreatedOn - 08-Aug-2023 8:12:56 pm
// * @Usage - Enable this when we want to use JSP's
// *
// */
//
//package com.kudlimath.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * 
// */
//
//@Configuration
//@EnableWebMvc
//public class WebMvcConfig implements WebMvcConfigurer {
// 
//  @Bean
//  public ViewResolver viewResolver() {
//    final InternalResourceViewResolver bean = new InternalResourceViewResolver();
//    bean.setViewClass(JstlView.class);
//    bean.setPrefix("/WEB-INF/jsp/");
//    bean.setSuffix(".jsp");
//    return bean;
//  }
//
//  @Override
//  public void configureViewResolvers(ViewResolverRegistry registry) {
//    registry.viewResolver(viewResolver());
//  }
//
//  @Override
//  public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    registry
//    .addResourceHandler("/**")
//    .addResourceLocations("classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/")
//    .setCachePeriod(3600)
//    .resourceChain(true)
//    .addResolver(new PathResourceResolver());
//  }
//  
//}
