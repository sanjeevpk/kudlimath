/**
 * © Copyright SanSys Pvt. Ltd. All rights reserved. SanSys is a registered trademark and the SanSys graphic logo is a trademark of SanSys Pvt. Ltd.
 * SanSys reserves all the right for this source code. You should not modify or reuse without the noticing it to SanSys. And need to provide 
 * credits where applicable. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific governing permissions and
 * limitations under the License.
 *
 * @author - Sanjeev
 * @version - 1.0
 * @CreatedOn - 08-Aug-2023 9:36:34 pm
 * @Usage - 
 *
 */

package com.kudlimath.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kudlimath.entities.Yatigalu;
import com.kudlimath.repository.YatigaluRepository;

/**
 * 
 */

@Service
public class YatigaluService {

  @Autowired
  private YatigaluRepository yatigaluRepository;
  
  /**
   * @return
   */
  public List<Yatigalu> getAllYatigalu() {
    
    return yatigaluRepository.findAll();
  }

}
